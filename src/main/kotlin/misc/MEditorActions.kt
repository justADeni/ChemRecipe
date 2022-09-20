package misc

import java.awt.Color
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent


class MEditorActions : MouseAdapter() {
    override fun mouseEntered(e: MouseEvent?) {
        for (label in Inst.mEditor.listLabel) {
            if (label == e?.component) {
                label.background = Color(204,204,204)
                label.repaint()
            }
        }
    }

    override fun mouseExited(e: MouseEvent?) {
        for (label in Inst.mEditor.listLabel) {
            if (label == e?.component) {
                label.background = Color(139,139,139)
                label.repaint()
            }
        }
    }
}