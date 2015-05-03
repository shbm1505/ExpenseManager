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
 * Created by shubham on 4/16/2015.
 */
public class MainActivity2 extends ActionBarActivity {
    Button b1,b2;
    TextView tx1;
    EditText e2;
    int sum=0;
    int l,c=2,k,i,count=0;
    int arr[]=new int[50];
    String st;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button4);
        tx1=(TextView)findViewById(R.id.textView2);
        e2=(EditText)findViewById(R.id.editText2);
        Intent intent=getIntent();
         st=intent.getStringExtra("order");
         k= Integer.parseInt(st);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(c<=k)
               {   String str=String.valueOf(c);
                   tx1.setText(str);
               }
                String x=e2.getText().toString();
                i=Integer.parseInt(x);
                arr[count]=i;
                count++;



            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c<=k)
                {
                    String str=String.valueOf(c);
                    tx1.setText(str);
                    c=c+1;
                }
        /*        if(c==k)
                {
                    Intent intent2 = new Intent(MainActivity2.this, MainActivity3.class);
                    intent2.putExtra("orders", st);
                    intent2.putExtra("or",arr);
                    String l=String.valueOf(c);
                    intent2.putExtra("ors",l);
                    startActivity(intent2);



          /*      }

                String x=e2.getText().toString();
                i=Integer.parseInt(x);
                arr[count]=i;
                count++;

            }
        });

}
}
