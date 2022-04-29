package com.example.finaldemo;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class myntra extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myntra);
        WebView webView;
        webView =findViewById(R.id.myntra);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        //webView.getSettings().setBuiltInZoomControls(true);
        webView.loadUrl("https://www.myntra.com/?utm_source=perf_bing_traffic&utm_medium=perf_bing_traffic&utm_campaign=Bing_Brand_BMM_Desktop&utm_source=bing");

    };
}
