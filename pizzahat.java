package com.example.finaldemo;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class pizzahat extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizzahat);
        WebView webView;
        webView =findViewById(R.id.pizzahat);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        //webView.getSettings().setBuiltInZoomControls(true);
        webView.loadUrl("https://www.pizzahut.co.in/map/?latLong=18.5204303,73.8567437&disposition=collection");

    }
}
