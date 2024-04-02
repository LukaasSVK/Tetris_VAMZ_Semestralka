package com.example.tetris_bloky_v_pohybe

import Ine.TetrisHra
import Objekty.Kocka
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.util.TypedValue
import android.view.View
import android.view.animation.TranslateAnimation
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.tetris_bloky_v_pohybe.R

private lateinit var tetrisGridLayout: LinearLayout
private lateinit var tetrisHra: TetrisHra

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tetrisGridLayout = findViewById(R.id.tetrisGridLayout)
        tetrisHra = TetrisHra()

        // Spustíme vlákno, ktoré bude aktualizovať polohu kociek
        val handler = Handler()
        handler.post(object : Runnable {
            override fun run() {
                tetrisHra.update()
                updateGrid()
                handler.postDelayed(this, 1000) // Aktualizácia každú sekundu
            }
        })
    }
    private fun updateGrid() {
        tetrisGridLayout.removeAllViews()
        val grid = tetrisHra.getGrid()
        for (row in grid) {
            val rowLayout = LinearLayout(this)
            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            rowLayout.layoutParams = params
            for (cell in row) {
                val textView = TextView(this)
                val sizeInPixels = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP,
                    Kocka.SIZE.toFloat(),
                    resources.displayMetrics
                ).toInt()
                val layoutParams = LinearLayout.LayoutParams(sizeInPixels, sizeInPixels)
                textView.layoutParams = layoutParams
                textView.setBackgroundColor(cell)
                rowLayout.addView(textView)
            }
            tetrisGridLayout.addView(rowLayout)
        }
    }


}

