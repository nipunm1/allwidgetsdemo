package com.cmpundhir.cm.allwidgetsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
    private void init(){
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent intent = null;
        switch (id){
            case R.id.b1 : intent = new Intent(MainActivity.this,ToastActivity.class);break;
            case R.id.b2 : intent = new Intent(MainActivity.this,ButtonActivity.class);break;
            case R.id.b3 : intent = new Intent(MainActivity.this,FormActivity.class);break;
            case R.id.b4 : intent = new Intent(MainActivity.this,IntentActivity.class);break;
            case R.id.b5 : intent = new Intent(MainActivity.this,DialogueActivity.class);break;
            case R.id.b6 : intent = new Intent(MainActivity.this,PermissionActivity.class);break;
            case R.id.b7 : intent = new Intent(MainActivity.this,WebViewProgressBarActivity.class);break;
            case R.id.b8 : intent = new Intent(MainActivity.this,ListViewActivity.class);break;
            case R.id.b9 : intent = new Intent(MainActivity.this,RecyclerVierActivity.class);break;
            case R.id.b10 : intent = new Intent(MainActivity.this,ButterKnifeActivity.class);break;
            case R.id.b11 : intent = new Intent(MainActivity.this,VolleyActivity.class);break;
            case R.id.b12 : intent = new Intent(MainActivity.this,RetroFitActivity.class);break;
            case R.id.b13 : intent = new Intent(MainActivity.this,AutoCompleteTextViewAndSpinnerActivity.class);
        }
        if(intent!=null)
        startActivity(intent);
    }
}
