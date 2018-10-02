package com.example.eunra.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class sub extends AppCompatActivity {

    private TextView soa,sob, kq;
    private Button tong, hieu;
    private EditText soc;
    TwosoAdapter arcus;
    ListView lv;
    public static ArrayList<Twoso> ls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        lv =findViewById(R.id.lv);
        soc = findViewById(R.id.soc);
        tong = findViewById(R.id.tong);
        hieu = findViewById(R.id.hieu);
        kq =findViewById(R.id.kq);
        soa = findViewById(R.id.soa);
        sob = findViewById(R.id.sob);

        Intent intent = getIntent();
        if(intent != null){
            Bundle bundle = intent.getBundleExtra(MainActivity.BUNDLE);
            if(bundle != null){
                 soa.setText(bundle.getString(MainActivity.A));
                sob.setText(  bundle.getString(MainActivity.B));
                soa.setVisibility(View.GONE);
                sob.setVisibility(View.GONE);

            }else{
                soa.setText(intent.getStringExtra(MainActivity.A));
                sob.setText(intent.getStringExtra(MainActivity.B));
            }
        }

        if(ls.isEmpty() == true){
            ls.add(new Twoso(3,5));
            ls.add(new Twoso(3,5));
            ls.add(new Twoso(3,5));
            ls.add(new Twoso(3,5));
            ls.add(new Twoso(3,5));
            ls.add(new Twoso(Integer.parseInt(soa.getText().toString()), Integer.parseInt(sob.getText().toString())));
        }else{
            ls.add(new Twoso(Integer.parseInt(soa.getText().toString()), Integer.parseInt(sob.getText().toString())));
        }


        arcus = new TwosoAdapter(sub.this, R.layout.cus_layout, ls);

        lv.setAdapter(arcus);





        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(sub.this, ""+position, Toast.LENGTH_SHORT).show();
            }
        });

        tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(sub.this, ""+soa.getText().toString() + sob.getText().toString(), Toast.LENGTH_SHORT).show();
                int tong = Integer.parseInt(soa.getText().toString())+ Integer.parseInt(sob.getText().toString()) + Integer.parseInt(soc.getText().toString());
                kq.setText(tong+"");

            }
        });
        hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
