package com.shivang.loginbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1=(TextView)findViewById(R.id.textView);
        tv2=(TextView)findViewById(R.id.textView2);
        tv3=(TextView)findViewById(R.id.textView3);
        tv4=(TextView)findViewById(R.id.textView4);
        tv5=(TextView)findViewById(R.id.textView5);


        Intent intent=getIntent();
        Bundle extraBundle=intent.getExtras();
        if(!extraBundle.isEmpty())
        {
            tv1.setText(extraBundle.getString("Name","s"));
            tv2.setText(extraBundle.getString("Age","s"));
            tv3.setText(extraBundle.getString("Batch","s"));
            tv4.setText(extraBundle.getString("EN","s"));
            tv5.setText(extraBundle.getString("CGPA","s"));


        }


    }
}
