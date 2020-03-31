package com.example.sample_login_app.Web;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sample_login_app.R;

public class Web_view extends AppCompatActivity {

    private TextView web_address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        //web_address=(TextView)findViewById(R.id.web_link);

        Intent i=getIntent();

        Intent i2=getIntent();

        Bundle bundle = getIntent().getExtras();
        if (bundle!= null) {
            String value = bundle.getString("RESTRURANT_LINK").toString();
            web_address.setText(value);
        }
        String massage2=i2.getStringExtra(" Hostels_LINK");
        web_address.setText(massage2);


    }
}
