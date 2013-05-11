package ru.bram.sociall;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webViewActivity extends Activity {
	WebView webv;
	MenuItem menuItem;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.web_view);
	    ActionBar actionBar = getActionBar(); 
	    actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME
	        | ActionBar.DISPLAY_SHOW_TITLE | ActionBar.DISPLAY_SHOW_CUSTOM);
	    actionBar.setHomeButtonEnabled(true);
		webv = (WebView) findViewById(R.id.webView1);
		webv.getSettings().setJavaScriptEnabled(true);
		webv.setWebViewClient(new WebViewClient());
	    webv.loadUrl(getIntent().getExtras().getString("url"));
	}

	  @Override
	  public boolean onCreateOptionsMenu(Menu menu) {
	    getMenuInflater().inflate(R.menu.webview_action, menu);
	    return true;
	  }

	  @Override
	  public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	    case R.id.menu_load:
	      menuItem = item;
	      menuItem.setActionView(R.layout.action_bar);
	      menuItem.expandActionView();
	      webv.reload(); 
	      break;
	    default:
	      break;
	    }
	    return true;
	  }
}

