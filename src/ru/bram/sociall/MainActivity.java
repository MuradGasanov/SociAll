package ru.bram.sociall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	Button btnVk, btnFb, btnTwt;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnVk = (Button) findViewById(R.id.btnVk);
        btnFb = (Button) findViewById(R.id.btnFb);
        btnTwt = (Button) findViewById(R.id.btnTwt);
        btnFb.setOnClickListener(this);
        btnVk.setOnClickListener(this);
        btnTwt.setOnClickListener(this);
    }

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnFb : {
			loadUrl1("http://fb.me");
			break;
		}
		case R.id.btnVk : {
			loadUrl1("http://vk.com");
			break;
		}
		case R.id.btnTwt : {
			loadUrl1("http://twitter.com");
			break;
		}
		default:
			break;
		}
	}

	private void loadUrl1(String s) {
		Intent intent1 = new Intent(MainActivity.this, webViewActivity.class);
		intent1.putExtra("url", s);
		startActivity(intent1);
	}
}