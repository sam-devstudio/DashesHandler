package com.techstack.app.dashes_handler

import android.widget.EditText
import androidx.core.widget.doAfterTextChanged

fun EditText.addDashes(placeAfter: Int = 3, separator: Char = '-') {
    var isEditing = false
    this.doAfterTextChanged {
        val count = it!!.count()
        if (count >= placeAfter) {
            if (!isEditing) {
                isEditing = true
                val replaced = text.toString().replace(separator.toString(), "")
                val sb = StringBuilder()
                for (i in replaced.indices) {
                    if (i != 0 && i % placeAfter == 0) {
                        sb.append(separator)
                    }
                    sb.append(replaced[i])
                }
                setText("")
                append(sb.toString())
                isEditing = false
            }

        }
    }
}

