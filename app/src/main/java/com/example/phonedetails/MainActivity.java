package com.example.phonedetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewSetInformation;
    private Button buttonGetInformation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initListeners();
    }
    private void initViews() {
        textViewSetInformation = (TextView) findViewById(R.id.textViewSetInformation);
        buttonGetInformation = (Button) findViewById(R.id.buttonGetInformation);
    }
    private void initListeners(){
        buttonGetInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String information = getHardwareAndSoftwareInfo();
                textViewSetInformation.setText(information);
            }
        });
    }
    private String getHardwareAndSoftwareInfo() {
        return "SERIAL:" + " " + Build.SERIAL + "\n" +
                "MODEL:" + " " + Build.MODEL + "\n" +
                "ID:" + " " + Build.ID + "\n" +
                "MANUFACTURER:" + " " + Build.MANUFACTURER + "\n" +
                "BRAND:" + " " + Build.BRAND + "\n" +
                "TYPE:" + " " + Build.TYPE + "\n" +
                "USER:" + " " + Build.USER + "\n" +
                "BASE:" + " " + Build.VERSION_CODES.BASE + "\n" +
                "INCREMENTAL:" + " " + Build.VERSION.INCREMENTAL + "\n" +
                "SDK:" + " " + Build.VERSION.SDK + "\n" +
                "BOARD:" + " " + Build.BOARD + "\n" +
                "HOST:" + " " + Build.HOST + "\n" +
                "FINGERPRINT:" + " " + Build.FINGERPRINT + "\n" +
                "OS VERSION:" + " " + Build.VERSION.RELEASE + "\n" +
                "PRODUCT:" + " " + Build.PRODUCT;
    }

}
