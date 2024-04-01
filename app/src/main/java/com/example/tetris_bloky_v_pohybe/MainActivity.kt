package com.example.tetris_bloky_v_pohybe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import android.view.View
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tetris_bloky_v_pohybe.ui.theme.Tetris_bloky_v_pohybeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    /**
     * Čo spraviť
     * 0. Začať pracovať na základnom hernom princípe
     * 1. Vedieť vygenerovať jednu postupne padajúcu kocku
     * 2. Vedieť z jednej kocky spraviť postupne padajúci náhodne sa generujúci blok
     * 3. Pridávať bloky do "polopohyblivého gridu" -> čo spadnú na požadované miesto
     * 4. Pridať padajúce bloky do pohyblivého gridu (ak už tak nebolo spravené)
     * 5. Spraviť základnú funkciu pre "odpálenie plného riadku
     * Zatiaľ toľko, zvyšok sa bude postupne pripisovať
     */
    fun ukoncenie(view: View?){
        finishAndRemoveTask()
    }

    fun start(view: View?){

    }

    fun nastavenia(view: View?){

    }

    fun rebricek(view: View?){

    }
}
