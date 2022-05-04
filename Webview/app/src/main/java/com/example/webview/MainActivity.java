package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
     WebView w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the WebView by its ID
         w = (WebView) findViewById(R.id.web);

        w.loadUrl("https://animekaizoku.com/");

        // this will enable the javascript.
        w.getSettings().setJavaScriptEnabled(true);

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        w.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(w != null && w.canGoBack()){
            w.goBack();
        }else{
            super.onBackPressed();
        }
    }
}