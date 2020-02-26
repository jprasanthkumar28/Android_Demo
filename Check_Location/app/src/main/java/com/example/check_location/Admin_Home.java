package com.example.check_location;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Admin_Home extends AppCompatActivity implements Add_Block.ExampleDialogListener{

    private TextView t1,t2;
    HashMap<String, String> info = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin__home);
//        t1 = findViewById(R.id.textView6);
//        t2 = findViewById(R.id.textView7);
        Button button_block = (Button) findViewById(R.id.add_room1);
        Button button_r = (Button) findViewById(R.id.add_room);
        Button signout = (Button) findViewById(R.id.signout);
        button_block.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
//                openDialog();
//                Intent i = new Intent(Admin_Home.this, Admin_Home.class);
//
            }
        });

        button_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
            }
        });

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Admin_Home.this, MainActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Signout",Toast.LENGTH_SHORT).show();
            }
        });
    }
//    public void openDialog() {
//        Add_Block exampleDialog = new  Add_Block();
//        Toast.makeText(getApplicationContext(),"object created",Toast.LENGTH_SHORT).show();
//        exampleDialog.show(getSupportFragmentManager(), "example dialog");
//    }
    @Override
    public void applyTexts(String username, String password) {
        info.put(username, password);
//        System.out.println(info);
//        t1.setText(info.toString());
        t1.setText("");


        Iterator itr = info.entrySet().iterator();
        t1.setText(t1.getText()+"Details");
        while(itr.hasNext()){
            Map.Entry pair = (Map.Entry) itr.next();
            t1.setText(t1.getText() + "\n" + pair.getKey() + "      :    " + pair.getValue()+ "\n");
            //iterator.remove();
        }
//        for(String value : info.keySet()){
//            t1.setText(t1.getText() + "\n" + value);
//        }
//
//        for(String value : info.values()){
//            t2.setText(t2.getText() + "\n" + value);
//        }

//            t1.setText(key);
//            t2.setText(value);
//        }
//            Intent i = new Intent(Admin_Home.this, Add_Block.class);
//        i.putExtra("roomname",username);
//        i.putExtra("rooms",password);
//        startActivity(i);
    }

}
