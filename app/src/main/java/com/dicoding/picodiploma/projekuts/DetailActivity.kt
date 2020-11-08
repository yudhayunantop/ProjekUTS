package com.dicoding.picodiploma.projekuts

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.TypedValue
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    companion object {
        const val NAMA = "extra_name"
        const val DETAIL = "extra_detail"
        const val PHOTO = "extra_photo"
        const val WEB = "extra_web"
        const val EMAIL = "extra_email"
        const val LINKJURUSAN = "extra_linkjurusan"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.title = intent.getStringExtra(NAMA)

        showContent()

    }

    fun showContent() {
        val tvDataName: TextView = findViewById(R.id.tv_item_name)
        val ivPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvDataDetail: TextView = findViewById(R.id.tv_item_detail)
        val tvEmail: TextView = findViewById(R.id.tv_email)
        val tvWeb: TextView = findViewById(R.id.tv_web)

        val name = intent.getStringExtra(NAMA)
        val text1 = "$name"
        tvDataName.text = text1

        val detail = intent.getStringExtra(DETAIL)
        val text2 = "$detail"
        tvDataDetail.text = text2

        val email = intent.getStringExtra(EMAIL)
        val text3 = "$email"
        tvEmail.text = text3

        val web = intent.getStringExtra(WEB)
        val text4 = "$web"
        tvWeb.text = text4

        val photo = intent.getIntExtra(PHOTO, 0)
        ivPhoto.setImageResource(photo)

        val linkJurusan = intent.getStringArrayExtra(LINKJURUSAN)
        var container = findViewById<LinearLayout>(R.id.linkJurusan)
        for (i in 0 until linkJurusan!!.size) {
            val txt = TextView(this)
            txt.text = linkJurusan[i]

//            android:layout_width="0dp"
//            android:layout_height="wrap_content"

            txt.setTextColor(tvWeb.currentTextColor)
            txt.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            txt.setPadding(64, 0, 0, 0)


            container.addView(txt)
            txt.setOnClickListener {
                clickWeb(linkJurusan[i])
            }
        }

        tv_email.setOnClickListener {
            clickEmail(email!!)
        }
        tv_web.setOnClickListener {
            clickWeb(web!!)
        }
    }

    private fun clickEmail(email: String) {
        val mailIntent = Intent(Intent.ACTION_SEND)

        mailIntent.data = Uri.parse("mailto:")
        mailIntent.type = "text/plain"

        mailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))

        startActivity(Intent.createChooser(mailIntent, "Choose Email..."))
    }

    private fun clickWeb(url: String) {
        val showWebActivity = Intent(this, websiteFakultass::class.java)
        //Kiriman Intent
        showWebActivity.putExtra(Intent.ACTION_VIEW, url)

        //Menjalankan Activity FakultasWeb dengan Intent
        startActivity(showWebActivity)
    }


}