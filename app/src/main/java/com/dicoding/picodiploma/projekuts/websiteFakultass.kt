package com.dicoding.picodiploma.projekuts

import android.content.Intent.ACTION_VIEW
import android.os.Build
import android.os.Bundle
import android.view.View
import android.webkit.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_web_view.*


class websiteFakultass : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        supportActionBar?.hide()

        loading.max = 100
        settings()
        loadWebsite()
    }

    private fun settings() {
        val myWeb_settings = webFakultas.settings
        myWeb_settings.javaScriptEnabled = true
        myWeb_settings.allowContentAccess = true
        myWeb_settings.useWideViewPort = true
        myWeb_settings.loadsImagesAutomatically = true
        myWeb_settings.cacheMode = WebSettings.LOAD_NO_CACHE
        myWeb_settings.setRenderPriority(WebSettings.RenderPriority.HIGH)
        myWeb_settings.setEnableSmoothTransition(true)
        myWeb_settings.domStorageEnabled = true
    }

    private fun loadWebsite() {
        var website = intent.getStringExtra(ACTION_VIEW)

        if (Build.VERSION.SDK_INT >= 19) {
            webFakultas.setLayerType(View.LAYER_TYPE_HARDWARE, null)
        } else {
            webFakultas.setLayerType(View.LAYER_TYPE_SOFTWARE, null)
        }
        webFakultas.webChromeClient = object : WebChromeClient() {
            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                loading.visibility = View.VISIBLE
                loading.progress = newProgress
                if (newProgress == 100) {
                    loading.visibility = View.GONE
                }
                super.onProgressChanged(view, newProgress)
            }
        }
        webFakultas.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, URL: String?): Boolean {
                view?.loadUrl(URL!!)
                loading.visibility = View.VISIBLE
                return true
            }

            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    view?.loadUrl(request?.url.toString())
                }
                loading.visibility = View.VISIBLE
                return true
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                loading.visibility = View.GONE
            }
        }

        webFakultas.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        webFakultas.loadUrl(website!!)
    }

    override fun onBackPressed() {
        if (webFakultas.canGoBack()) {
            webFakultas.goBack()
        } else {
            super.onBackPressed()
        }
    }
}