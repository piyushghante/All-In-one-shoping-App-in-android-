package com.example.finaldemo;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class ajio extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajio);
        WebView webView;
        webView =findViewById(R.id.ajio);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.loadUrl("https://www.ajio.com/?sskey=64183d1d131c442da20530e6960ea31e&utm_source=xyzdeals&utm_medium=affiliate&utm_campaign=CK_64183d1d131c442da20530e6960ea31e_712877_V5pbnS0jRRGv4SjH3cwihQ&clickID=48878067&");

    };
}
