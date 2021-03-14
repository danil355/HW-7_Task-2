package kz.step.hw_7_task_2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat

class ActivitySecond : AppCompatActivity() {

    var data: Bundle? = null
    var textView: TextView? = null

    fun initializeArguments() {

        data = intent.extras
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        textView = findViewById(R.id.textView)
        initializeArguments()
        initiateProcessData()
    }

    @SuppressLint("SetTextI18n")
    private fun initiateProcessData() {
        val res = getResources()
        val name = data?.getString("Имя")
        val surname = data?.getString("Фамилия")
        val image = ResourcesCompat.getDrawable(res, R.drawable.volf, null)
        textView?.setText("Имя: " + name + "\n\nФамилия: " + surname + "\n\n")
        findViewById<ImageView>(R.id.imageView_second).setImageDrawable(image)

    }
}