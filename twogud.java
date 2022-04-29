package com.example.finaldemo;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class twogud extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twogud);
        WebView webView;
        webView =findViewById(R.id.twogud);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.loadUrl("https://www.2gud.com/2gud/~cs-ax436s1hmm/pr?sid=2gd%2Cp49%2Ckns%2Cfht&collection-tab-name=Best+Refurbished+Phones&otracker=nmenu_sub_Mobiles_0_Rs.%204%2C000%20-%20Rs.%206%2C000");

    };
}
