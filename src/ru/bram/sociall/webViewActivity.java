package ru.bram.sociall;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webViewActivity extends Activity {
	WebView webv;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.web_view);
		webv = (WebView) findViewById(R.id.webView1);
		webv.getSettings().setJavaScriptEnabled(true);
		webv.setWebViewClient(new WebViewClient());
		webv.loadUrl(getIntent().getExtras().getString("url"));
	}
}