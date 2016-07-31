package github.vatsal.kandy

import android.content.SharedPreferences
import java.util.*

class ExtensionFun {

    // extension functions
    fun Date.isMonday(): Boolean {
        return true
    }

    fun Date.isTuesday() = true

    var date: Date? = null

    // using extension function as a part of the object
    val isMonday = date?.isMonday()
    val isTuesday = date?.isTuesday()


    // high order extension functions
    fun SharedPreferences.edit(func: SharedPreferences.Editor.() -> Unit) {
        val editor = edit()
        editor.func()
        editor.apply()
    }

    var sharedPref: SharedPreferences? = null

    // using high order extension functions
    fun spDemo() {
        sharedPref!!.edit {
            putString("key", "name")
        }
    }
}
