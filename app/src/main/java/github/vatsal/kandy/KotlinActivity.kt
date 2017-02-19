package github.vatsal.kandy

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import kotlinx.android.synthetic.main.content_kotlin.*

class KotlinActivity : AppCompatActivity() {

    // declaring value
    // does not need any type
    // Kotlin does it automatically
    // also notice no more semi-colon(;) needed
    // rad right!
    val textStart = "Made with"
    val textEnd = "using Kotlin!"
    var tvDemo = null as TextView?

    // the ? is used to ensure the null exception never comes
    // we are thy saved
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        // the initialising method call
        init()
    }

    // no more return type for a method :@
    // fun is a keyword to declare a function
    private fun init() {

        // declaring and assigning a val as a ToolBar
        val toolbar = findViewById(R.id.toolbar) as Toolbar?
        setSupportActionBar(toolbar)

        // eliminate the NULL by using question mark
        val tvStart = findViewById(R.id.tv_start) as TextView?

        // var can be reassigned but a val cannot be
        tvDemo = findViewById(R.id.tv_demo) as TextView?

        // easy val setting
        // not-null assertions(!!)
        tvStart?.text = textStart
        tv_end!!.text = textEnd

        val fab = findViewById(R.id.fab) as FloatingActionButton?

        // finally no more big ClickListeners!!
        // just single line
        fab!!.setOnClickListener { openRepo() }

        etDemo!!.setOnEditorActionListener(TextView.OnEditorActionListener { textView, i, keyEvent ->

            if (i == EditorInfo.IME_ACTION_SEARCH || i == EditorInfo.IME_ACTION_DONE ||
                    keyEvent!!.action == KeyEvent.ACTION_DOWN &&
                            keyEvent!!.keyCode == KeyEvent.KEYCODE_ENTER) {
                tvDemo!!.text = "\"" + textView.text + "\""
                tvDemo!!.visibility = View.VISIBLE
                etDemo!!.visibility = View.GONE
                true
            }
            false

        })

        et_demo!!.setOnClickListener { editTextView() }
    }

    private fun editTextView() {
        tvDemo!!.visibility = View.GONE
        etDemo!!.text = null
        etDemo!!.visibility = View.VISIBLE
    }

    private fun openRepo() {
        val url = "https://github.com/code-crusher/KAndy"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }

    // referencing the imported ids
    private val etDemo by lazy {
        et_demo
    }

}
