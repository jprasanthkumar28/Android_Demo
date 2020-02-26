package com.example.fetch_data;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    String strUrl = "https://ims-dev.iiit.ac.in/test.php";
    String result = "";
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Fetch().execute();
            }
        });
    }
    public class Fetch extends AsyncTask<String, String, String> {

        @Override
        protected void onPostExecute(String s) {
            Toast.makeText(MainActivity.this,"The result is" + result, Toast.LENGTH_LONG).show();
        }
        @Override
        protected String doInBackground(String... strings) {
            try {

                URL url = new URL(strUrl);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                String value = bufferedReader.readLine();
                System.out.println(value.getClass() + "==================");
                System.out.println(value);
                System.out.println("Haiiiiiiii---------------------------------------------------");
                result = value;

                for (int i = 0; i < result.length(); i++){
//                    char c = result.charAt(i);
                    //Process char
                    System.out.println(result);
                }



            }
            catch (Exception e) {
                System.out.println(e);
            }
            return null;
        }
    }
}
