package com.example.fetch_data;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FetchAnActivity extends AsyncTask<String,String, String> {

    String strUrl = "https://www.google.com";
    @Override
    protected String doInBackground(String... strings) {
        try {

            URL url = new URL(strUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String value = bufferedReader.readLine();
            System.out.println("Haiiiiiiii---------------------------------------------------");


        }
        catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
//    String line = "";
//    String data = "";
//    JSONArray JA;
//    Context c;
//
//    public FetchAnActivity(Context c) {
//        this.c = c;
//    }
//
//    final static String TAG = "ProductInfo";
//
//    public FetchAnActivity(TextView activities, ProgressBar progressBar) {
//
//    }
//
//    protected void onPostExecute( FetchAnActivity obj ) {
//        AsyncListener asyncListener = null;
//        asyncListener.doStuff(obj);
//    }
//    @Override
//    protected String doInBackground(String... voids) {
//        try {
//            URL url = new URL("https://f8bd08a1.ngrok.io/"+voids[0]);
//            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//            InputStream inputStream = httpURLConnection.getInputStream();
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//            while (line != null) {
//                line = bufferedReader.readLine();
//                data = data+line;
//            }
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            JA = new JSONArray(data);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        return data;
//    }
}
