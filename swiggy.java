package com.example.finaldemo;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class swiggy extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy);
        WebView webView;
        webView =findViewById(R.id.swiggy);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.loadUrl("https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=google_search_sok_food_na_narm_order_web_m_web_clubbedcities_neev_brand_newuser_v1_v2_brand_em&gclid=Cj0KCQjwma6TBhDIARIsAOKuANwUUiXr-qZVpojWbQTJBXYL0SSKMvQyb2QThPxBedDlerAWHbfklnkaAptPEALw_wcB");

    };
}
