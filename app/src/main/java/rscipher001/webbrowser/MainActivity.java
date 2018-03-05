package rscipher001.webbrowser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView myWebView;
    EditText eturl;
    Button submit;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView = findViewById(R.id.webView);
        eturl = findViewById(R.id.url);
        submit = findViewById(R.id.submit);

        myWebView.setWebViewClient(new WebViewClient());
        WebSettings myWebSettings = myWebView.getSettings();
        myWebSettings.setJavaScriptEnabled(true);
//        myWebView.loadUrl("https://www.whatismybrowser.com/detect/are-third-party-cookies-enabled");
        myWebView.loadUrl("https://www.google.co.in/");

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWebView.loadUrl(eturl.getText().toString());
            }
        });


    }
}
