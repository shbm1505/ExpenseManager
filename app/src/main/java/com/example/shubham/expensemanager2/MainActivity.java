package com.example.shubham.expensemanager2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
Button b;
EditText e;
    int c=1,i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
      e=(EditText)findViewById(R.id.editText1);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=e.getText().toString();
                i=Integer.parseInt(str);
                String br = Integer.toString(i);


                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);



                    intent.putExtra("order", br);


                    startActivity(intent);


                }    });
    }







    }

