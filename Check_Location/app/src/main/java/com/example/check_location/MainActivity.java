package com.example.check_location;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button2);
//        result = (TextView) findViewById(R.id.result);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Admin_Login.class);
                startActivity(i);
            }
        });


        Intent i = getIntent();
        String roomname = i.getStringExtra("roomname");
        String rooms = i.getStringExtra("rooms");
        Toast.makeText(getApplicationContext(),roomname+" "+rooms,Toast.LENGTH_SHORT).show();
    }


}
