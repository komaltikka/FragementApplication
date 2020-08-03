package com.example.fragementapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    WebView webView;
    Button buttonhtml,buttonweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        buttonhtml=findViewById(R.id.staticHtml);
        buttonweb=findViewById(R.id.loadWebPage);
        webView=findViewById(R.id.webview);


        buttonhtml.setOnClickListener(this);
        buttonweb.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.staticHtml:
                String customHtml = "<html><body><h1>Hello, Android App Developer</h1>" +
                        "<h1>Heading 1</h1><h2>Heading 2</h2><h3>Heading 3</h3>" +
                        "<p>This is a sample paragraph of static HTML In Web view</p>" +
                        "</body></html>";
                webView.loadData(customHtml,"text/html","UTF-8");
                break;
            case R.id.loadWebPage:
                webView.setWebViewClient(new MyWebviewClient());
                String url ="https://chandansatyendraprasad.wordpress.com/";
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(url);
                break;
        }
    }

    private class MyWebviewClient extends WebViewClient {
        /**
         * @param view
         * @param url
         * @deprecated
         */
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
