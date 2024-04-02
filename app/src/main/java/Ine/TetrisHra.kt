package Ine

import Objekty.Kocka
import android.graphics.Color
import kotlin.random.Random

//táto trieda obsahuje logiku hry
class TetrisHra {
    private val tetrisGrid = TetrisGrid()
    private var currentBlock: Kocka? = null

    init {
        generateNewBlock()
    }

    fun update() {
        moveDown()
    }

    private fun generateNewBlock() {
        currentBlock = Kocka(TetrisGrid.WIDTH / 2 * Kocka.SIZE, 0)
    }

    private fun moveDown() {
        currentBlock?.moveDown()
    }

    fun getGrid(): Array<Array<Int>> {
        val grid = Array(TetrisGrid.WIDTH) { Array(TetrisGrid.HEIGHT) { Color.WHITE } }

        currentBlock?.let { block ->
            val x = block.x / Kocka.SIZE
            val y = block.y / Kocka.SIZE
            if (x in 0 until TetrisGrid.WIDTH && y in 0 until TetrisGrid.HEIGHT) {
                grid[x][y] = Kocka.COLOR
            }
        }

        return grid
    }
}