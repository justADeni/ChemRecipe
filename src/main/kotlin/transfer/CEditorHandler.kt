package transfer

import actions.CEditorActions
import actions.LeftMouseActions
import actions.SEditorActions
import misc.Inst
import java.awt.datatransfer.DataFlavor
import java.awt.datatransfer.Transferable
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.TransferHandler

class CEditorHandler() : TransferHandler("CEditor") {

    override fun canImport(comp: JComponent?, transferFlavors: Array<out DataFlavor>?): Boolean {
        if (comp is JLabel){
            if ((comp as JLabel).getClientProperty("connected") != null){
                return false
            }
        }
        return true
    }

    override fun importData(comp: JComponent?, t: Transferable?): Boolean {
        Inst.cEditor.add(Inst.currentDragged!!)
        Inst.currentDragged?.removeMouseListener(LeftMouseActions())
        Inst.currentDragged?.addMouseListener(CEditorActions())
        return true
    }
}