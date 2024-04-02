package Objekty
import android.graphics.Color
class Kocka(var x: Int, var y:Int) {
    companion object {
        const val SIZE = 30 // Veľkosť bloku
        val COLOR = Color.RED // Farba bloku (možno nastaviť podľa potreby)
    }
    fun moveDown() {
        x += SIZE / 2
    }

    fun moveLeft() {
        x -= SIZE
    }

    fun moveRight() {
        x += SIZE
    }
}