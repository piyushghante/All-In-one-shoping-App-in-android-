package com.example.finaldemo;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class tata extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tata);
        WebView webView;
        webView =findViewById(R.id.tata);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.loadUrl("https://www.tatacliq.com/?cid=ps:tata_cliq_brand_west:bing:generic_exact:brand&msclkid=f33a0ce75f0a14be722e6e8ce958d037");

    };
}
