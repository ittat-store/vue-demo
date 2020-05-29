package com.nannan.vue_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.sdk.WebChromeClient;

public class MainActivity extends AppCompatActivity {

    private X5WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebView = (X5WebView)findViewById(R.id.webview);
        // mWebView.setWebChromeClient(new WebChromeClient(){
        //     @Override
        //     public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        //         Log.i("consoleMessage", consoleMessage.message());
        //         return super.onConsoleMessage(consoleMessage);
        //     }
        // });
        // mWebView.getSettings();
        mWebView.loadUrl("file:///android_asset/vue/index.html");
        // mWebView.loadUrl("http://192.168.123.71");
    }

    @Override
    protected void onDestroy() {
        //释放资源
        if (mWebView != null)
            mWebView.destroy();
        super.onDestroy();
    }


}
