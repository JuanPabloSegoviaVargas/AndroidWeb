package com.example.hp.imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
    private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        web=(WebView)findViewById(R.id.webView);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());
        Bundle bundle = getIntent().getExtras();
        String dato=bundle.getString("direccion");
        web.loadUrl("http://"+dato);

    }
    @Override
    public void onBackPressed(){
        if(web.canGoBack()){
            web.goBack();
        }else{
            super.onBackPressed();
        }
    }

}
