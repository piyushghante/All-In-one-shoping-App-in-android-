package com.example.finaldemo;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class mobikwik extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobikwik);
        WebView webView;
        webView =findViewById(R.id.mobikwik);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        //webView.getSettings().setBuiltInZoomControls(true);
        webView.loadUrl("https://www.mobikwik.com/transfer-money-to-bank");

    };
}
