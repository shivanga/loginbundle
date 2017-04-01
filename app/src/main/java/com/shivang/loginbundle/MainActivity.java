package com.shivang.loginbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText5);
        e2=(EditText)findViewById(R.id.editText6);
        e3=(EditText)findViewById(R.id.editText7);
        e4=(EditText)findViewById(R.id.editText8);
        e5=(EditText)findViewById(R.id.editText9);
    }


    public  void submit(View view)
    {
        Intent intent=new Intent(this,Main2Activity.class );
        Bundle bundle=new Bundle();
        bundle.putString("Name",e1.getText().toString());
        bundle.putString("Age",e2.getText().toString());
        bundle.putString("Batch",e3.getText().toString());
        bundle.putString("EN",e4.getText().toString());
        bundle.putString("CGPA",e5.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
