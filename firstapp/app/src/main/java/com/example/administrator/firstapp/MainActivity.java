package com.example.administrator.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        EditText firedit=(EditText) findViewById(R.id.editText);
        TextView firview=(TextView) findViewById(R.id.textView);
        char[] str=firedit.getText().toString().toCharArray();
        String computer="2048";
        char[] target=computer.toCharArray();

        int T=0;
        int F=0;
         for(int i=0;i<str.length;i++)
             for(int j=0;j<target.length;j++){
                 if(str[i]==target[j])
                 {
                     if (i==j)
                         T++;
                     else
                         F++;
                 }
             }
        String ret=T+"T "+F+"F";
        firview.setText(ret);
    }
}
