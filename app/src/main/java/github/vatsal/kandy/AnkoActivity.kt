package github.vatsal.kandy

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*

class AnkoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setLayout()
    }

    private fun setLayout() {
        verticalLayout {
            padding = dip(16)
            editText {
                hint = "Name"
                textSize = 18f
            }
            editText {
                hint = "Password"
                textSize = 24f
            }
            button("Login") {
                backgroundColor = getResources().getColor(R.color.colorAccent)
                textColor = Color.parseColor("#ffffff")
                elevation = 3f
                textSize = 18f
            }.lparams(width = wrapContent) {
                horizontalMargin = dip(5)
                topMargin = dip(10)
            }
        }
    }
}
