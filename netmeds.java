package com.example.finaldemo;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class netmeds extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netmeds );
        WebView webView;
        webView =findViewById(R.id.netmeds);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        //webView.getSettings().setBuiltInZoomControls(true);
        webView.loadUrl("https://www.netmeds.com/healthstore?source_attribution=ADW-Search-Brand-OC-Sameday&utm_source=ADW-Search-Brand-OC-Sameday&utm_medium=CPC&utm_campaign=ADW-Search-Brand-OC-Sameday&gclid=Cj0KCQjwma6TBhDIARIsAOKuANyscW09BSUvw4x5glIi_5fNpyN-ujEY2KQMgqXKlcb06W0E8Bp0XGgaAlvBEALw_wcB");

    };
}
