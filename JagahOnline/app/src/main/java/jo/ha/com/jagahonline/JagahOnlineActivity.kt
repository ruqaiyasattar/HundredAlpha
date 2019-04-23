@file:Suppress("DEPRECATION")

package jo.ha.com.jagahonline

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_jagah_online.*


class JagahOnlineActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jagah_online)

        jagahonline.settings.setJavaScriptEnabled(true);
        jagahonline.webViewClient = WebViewClient()
        jagahonline.settings.setRenderPriority(WebSettings.RenderPriority.HIGH)
        jagahonline.settings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK)
        jagahonline.settings.setAppCacheEnabled(true)
        jagahonline.settings.supportMultipleWindows()
        jagahonline.settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS)
        jagahonline.settings.setUseWideViewPort(true);
        jagahonline.settings.setSaveFormData(true)
        jagahonline.settings.setSavePassword(true)
        jagahonline.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY)
        jagahonline.settings.setEnableSmoothTransition(true)

        jagahonline.settings.setLoadWithOverviewMode(hasWindowFocus());
        jagahonline.settings.displayZoomControls
        jagahonline.settings.supportZoom()
        jagahonline.canZoomIn()
        jagahonline.zoomIn()

        jagahonline.settings.setDomStorageEnabled(true);
        jagahonline.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        jagahonline.getSettings().setSupportZoom(true);
        jagahonline.getSettings().setBuiltInZoomControls(true);
        jagahonline.getSettings().setDisplayZoomControls(false);
        jagahonline.setInitialScale(100);

        jagahonline.loadUrl("https://www.jagahonline.com/Default.html")

    }


}
