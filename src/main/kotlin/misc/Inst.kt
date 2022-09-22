package misc

import panels.*
import java.awt.Font
import javax.swing.JFrame
import javax.swing.SwingUtilities

object Inst {
    val jframe = JFrame("ChemRecipe")

    lateinit var font: Font

    val loader = Loader()
    val sEditor = SEditor()
    val cEditor = CEditor()
    val center = Center()
    val left = Left()
    val right = Right()
    val actions = Actions()
    val menu = Menu()

    fun refresh(){
        SwingUtilities.updateComponentTreeUI(jframe)
    }
}