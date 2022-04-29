package com.example.finaldemo;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class makemytrip extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makemytrip);
        WebView webView;
        webView =findViewById(R.id.makemytrip);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.loadUrl("https://www.makemytrip.com/flights/?cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|&s_kwcid=AL!1631!3!!e!!s!!makemytrip&ef_id=3414f01690611a8b8912927d241db5d8:G:s");

    };
}
