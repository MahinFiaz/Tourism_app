package com.example.sample_login_app.Dhaka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.sample_login_app.R;

public class d_tran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_tran);
        WebView wv;
        wv = (WebView) findViewById(R.id.d_transport_id);
        wv.loadUrl("file:///android_asset/dhaka_transports.html");
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
