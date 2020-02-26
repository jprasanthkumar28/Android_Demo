package com.example.demo;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Problems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems);
//        Intent startingIntent = getIntent();
//        String whatYouSent = startingIntent.getStringExtra(key, value);
        Bundle gt=getIntent().getExtras();
        String strr = gt.getString("message");
        final TextView helloTextView = (TextView) findViewById(R.id.text_view_id);
        final TextView text2 = (TextView) findViewById(R.id.text_view_id2);

        helloTextView.setText(strr);

        String strr2=gt.getString("message2");
        text2.setText(strr2);

        Button button= (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Done",
                        Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:9535012896");
                Intent it = new Intent(Intent.ACTION_SENDTO, uri);
                it.putExtra("sms_body", "Hai Prashu");
                startActivity(it);
            }
        });

        Button button1 = (Button) findViewById(R.id.location);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Location",
                        Toast.LENGTH_SHORT).show();
                Intent it = new Intent(Problems.this, Location1.class);
                startActivity(it);
            }
        });

    }
}
