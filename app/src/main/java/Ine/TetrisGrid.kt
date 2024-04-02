package Ine
import Objekty.Kocka
import android.content.res.Resources

class TetrisGrid () {
    companion object {
        val displayMetrics = Resources.getSystem().displayMetrics
        var WIDTH = displayMetrics.widthPixels / Kocka.SIZE
        var HEIGHT = displayMetrics.heightPixels / Kocka.SIZE

    }

    val blocks = ArrayList<Kocka>()

    init {
        // Inicializácia hracej plochy s prázdnou polohou blokov
        for (i in 0 until WIDTH) {
            for (j in 0 until HEIGHT) {
                blocks.add(Kocka(i * Kocka.SIZE, j * Kocka.SIZE))
            }
        }
    }

    // Metóda na pridanie kocky na konkrétnu pozíciu v hracej ploche
    fun addBlock(x: Int, y: Int) {
        blocks.add(Kocka(x, y))
    }

    fun moveLeft() {
        for (block in blocks) {
            block.moveLeft()
        }
    }

    fun moveRight() {
        for (block in blocks) {
            block.moveRight()
        }
    }

    fun moveDown() {
        for (block in blocks) {
            block.moveDown()
        }
    }
}