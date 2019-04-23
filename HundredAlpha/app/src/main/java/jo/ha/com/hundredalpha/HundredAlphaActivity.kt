@file:Suppress("DEPRECATION")

package jo.ha.com.hundredalpha

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_hundred_alpha.*
import android.net.http.SslCertificate.saveState
import android.net.http.SslCertificate.restoreState






class HundredAlphaActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hundred_alpha)

        hundredAlpha.settings.setJavaScriptEnabled(true);
        hundredAlpha.webViewClient = WebViewClient()
        hundredAlpha.settings.setRenderPriority(WebSettings.RenderPriority.HIGH)
        hundredAlpha.settings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK)
        hundredAlpha.settings.setAppCacheEnabled(true)
        hundredAlpha.settings.supportMultipleWindows()
        hundredAlpha.settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS)
        hundredAlpha.settings.setUseWideViewPort(true);
        hundredAlpha.settings.setSaveFormData(true)
        hundredAlpha.settings.setSavePassword(true)
        hundredAlpha.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY)
        hundredAlpha.settings.setEnableSmoothTransition(true)

        hundredAlpha.settings.setLoadWithOverviewMode(hasWindowFocus());
        hundredAlpha.settings.displayZoomControls
        hundredAlpha.settings.supportZoom()
        hundredAlpha.canZoomIn()
        hundredAlpha.zoomIn()

        hundredAlpha.settings.setDomStorageEnabled(true);
        hundredAlpha.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        hundredAlpha.getSettings().setSupportZoom(true);
        hundredAlpha.getSettings().setBuiltInZoomControls(true);
        hundredAlpha.getSettings().setDisplayZoomControls(false);
        hundredAlpha.setInitialScale(100);

        hundredAlpha.loadUrl(" https://hundredalpha.com/Default.aspx")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        hundredAlpha.restoreState(savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        hundredAlpha.saveState(outState)
    }
}
