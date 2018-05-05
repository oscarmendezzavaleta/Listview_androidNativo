package com.example.pcoscar.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;


    private String nombres [] = {"Samuel" ,"Valentina","Santiago","Alejandro","Valeria","Benjamin" ,"Gerardo","Carlos","David","Sofia1"};
    private String edades [] = {"18","25","32","17","24","20" ,"27","15","19","23"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.tv1);
        lv1=(ListView)findViewById(R.id.lv1);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.list_item_geekipedia ,nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv1.setText("La Edad de " + lv1.getItemAtPosition(position) + " es " + edades[position] );
            }
        });
    }
}
