package com.example.eunra.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button send;
    private EditText a,b;
    public  static  final String A = "a";
    public static final String B = "b";
    public static final String BUNDLE = "bundel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send = findViewById(R.id.send);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                byExtras();
            }
        });


    }
    public void byExtras(){
        Intent intent = new Intent(MainActivity.this, sub.class);
        intent.putExtra(A, a.getText().toString());
        intent.putExtra(B, b.getText().toString());
        startActivity(intent);

    }
}
