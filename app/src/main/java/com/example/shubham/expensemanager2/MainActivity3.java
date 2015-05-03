package com.example.shubham.expensemanager2;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by shubham on 4/18/2015.
 */
public class MainActivity3 extends ActionBarActivity {

    EditText e2;
    int i,j;
    int arr[]=new int[50];
            Button b1,b2;
    TextView tx2;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tx2=(TextView)findViewById(R.id.textView3);
        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button4);
        Intent intent2=getIntent();
       String st=intent2.getStringExtra("orders");
        tx2.setText(st);
         arr= intent2.getIntArrayExtra("or");
        String l=intent2.getStringExtra("ors");
         j=Integer.parseInt(l);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x=e2.getText().toString();
                i=Integer.parseInt(x);
                arr[j]=i;
                j++;
            }
        });
    }
}
