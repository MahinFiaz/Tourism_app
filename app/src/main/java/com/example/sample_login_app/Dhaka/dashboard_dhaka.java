package com.example.sample_login_app.Dhaka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.sample_login_app.Compass;
import com.example.sample_login_app.Nevigation_view;
import com.example.sample_login_app.R;
import com.example.sample_login_app.Web.Web_view;
import com.example.sample_login_app.web;

public class dashboard_dhaka extends AppCompatActivity implements View.OnClickListener {

    ImageButton history,parks,meusium,university,transport,hotels,restrurant,maps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_dhaka);

        transport=(ImageButton)findViewById(R.id.transport_id);transport.setOnClickListener(this);
        hotels=(ImageButton)findViewById(R.id.hostel_id);hotels.setOnClickListener(this);
        restrurant=(ImageButton)findViewById(R.id.restrurants_id);restrurant.setOnClickListener(this);
        history=(ImageButton)findViewById(R.id.rounded_history_id);history.setOnClickListener(this);
        parks=(ImageButton)findViewById(R.id.natural_image);parks.setOnClickListener(this);
        meusium=(ImageButton)findViewById(R.id.Meuseams_image);meusium.setOnClickListener(this);
        university=(ImageButton)findViewById(R.id.University_places_id);university.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.transport_id:
                Intent i = new Intent(dashboard_dhaka.this, d_tran.class);startActivity(i);
                break;

            case R.id.hostel_id:
                Intent i2 = new Intent(dashboard_dhaka.this,d_hotels.class);startActivity(i2);
                break;

            case R.id.restrurants_id:
                Intent i3 = new Intent(dashboard_dhaka.this, d_ras.class);startActivity(i3);
                break;

            case R.id.rounded_history_id:
                Intent i4 = new Intent(dashboard_dhaka.this,d_history.class);startActivity(i4);
                break;
            case R.id.natural_image:
                Intent i5 = new Intent(dashboard_dhaka.this,d_parks.class);startActivity(i5);
                break;
            case R.id.Meuseams_image:
                Intent i6 = new Intent(dashboard_dhaka.this,d_meusiam.class);startActivity(i6);
                break;
            case R.id.University_places_id:
                Intent i7 = new Intent(dashboard_dhaka.this,d_university.class);startActivity(i7);
                break;
        }
    }
}
