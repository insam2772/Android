package com.cookandroid.baseapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    public class MainActivity extends AppCompatActivity {

        Button bt;
        Intent intent;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            bt = (Button) findViewById(R.id.bt_1);

            intent = new Intent(this, NextActivity.class);
            intent.putExtra("name", "kookmin");

            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"버튼을 눌렀어요",Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            });
        }
    }
