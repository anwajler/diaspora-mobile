package org.nowoczesnapolska.diaspora;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity {
    /** Called when the activity is first created. */
	private String PROTOCOL = new String("https://");
	private String PATH = new String("/users/sign_in/");
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final EditText pod = (EditText) findViewById(R.id.pod);
        Button login_btn = (Button) findViewById(R.id.login_btn);
        
        
        login_btn.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				String host = pod.getText().toString();
				String uri = PROTOCOL + host + PATH;

				
			}
		});
        
    }
}