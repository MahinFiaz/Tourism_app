package com.example.sample_login_app.nevigation_ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.sample_login_app.Bandarban.bandarban_dashboard;
import com.example.sample_login_app.Cox_Bazar.coxbazar_dashboard;
import com.example.sample_login_app.Dhaka.dashboard_dhaka;
import com.example.sample_login_app.R;
import com.example.sample_login_app.Sylhet.sylhet_dashboard;

public class HomeFragment extends Fragment implements  View.OnClickListener{

    private HomeViewModel homeViewModel;
    private ImageButton dhaka,sylhet,bandarban,coxbazar;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_home, container, false);
       // final TextView textView = root.findViewById(R.id.text_home);



       dhaka=root.findViewById(R.id.dhaka_id);
       dhaka.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i= new Intent(getActivity(), dashboard_dhaka.class);startActivity(i);
           }
       });




       sylhet=root.findViewById(R.id.Sylhet_id);
       sylhet.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i2= new Intent(getActivity(), sylhet_dashboard.class);startActivity(i2);
           }
       });


        bandarban=root.findViewById(R.id.Bandarban_id);
        bandarban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2= new Intent(getActivity(), bandarban_dashboard.class);startActivity(i2);
            }
        });



        coxbazar=root.findViewById(R.id.Coxbazar_id);
        coxbazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2= new Intent(getActivity(), coxbazar_dashboard.class);startActivity(i2);
            }
        });
        return root;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cardview1:

                break;
        }
    }
}