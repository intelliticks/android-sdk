package com.intelliticks.advosoft.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.intelliticks.webview.IntelliTicksWebView;
import com.intelliticks.webview.IntelliTicksWebViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* new IntelliTicksWebView.Builder(this).titleDefault("The Finest Artist").webViewJavaScriptEnabled(true)
                .show("https://app.intelliticks.com/landing/pSZJr5kbAY7jEwEtf_c/pricing");*/
        ////                    .toolbarScrollFlags(0)
               ///             .webViewJavaScriptEnabled(true)
        //                    .webViewUseWideViewPort(false)
        ////                    .show("http://andrewliu.in/2016/01/30/聊聊Redis的订阅发布/");
        //                    .show("http://www.youtube.com");


        new IntelliTicksWebView.Builder(this)
                .titleDefault("demo")
                .initilizeKey("pSZJr5kbAY7jEwEtf_c")
                .action("pricing")
                .toolbarScrollFlags(0)
                .webViewJavaScriptEnabled(true)
                .webViewUseWideViewPort(true)
                .webViewSupportZoom(true)
                .webViewBuiltInZoomControls(true)
                .webViewDisplayZoomControls(false)
                .showSwipeRefreshLayout(false)
                 .loadWeb();



    }
}
