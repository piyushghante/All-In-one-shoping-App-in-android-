package com.example.finaldemo;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class dominos extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dominos);
        WebView webView;
        webView =findViewById(R.id.dominos);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.loadUrl("https://pizzaonline.dominos.co.in/?src=google_sem_brand&utm_source=google&utm_medium=cpc&utm_campaign=Brand%20-%20Pan%20India%20-%20Desktop%20-%20Exact%20-%202016%20-%20[S]&utm_term=[dominos]&gclid=Cj0KCQjwma6TBhDIARIsAOKuANwn8ClIcaQOsDhW1tFsUzfRyEV6kI1Jrpsh19JB4agumnzKkLVZ7r0aAsooEALw_wcB");

    };
}
