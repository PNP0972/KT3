package com.example.ktr3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ListView listView;
        ArrayList<MainActivity> arrayList;
        AdapterActivity adapter;

        listView = findViewById(R.id.listviewSingers);
        arrayList = new ArrayList<>();
        arrayList.add(new MainActivity(R.drawable.huycan,"Cù Huy Cận","Huy Cận","Việt Nam","10"));
        arrayList.add(new MainActivity(R.drawable.macngon,"Mạc Ngôn","Mạc Ngôn","Việt Nam","7"));
        arrayList.add(new MainActivity(R.drawable.ws,"William Shakespeare","William Shakespeare ","Anh ","10"));
        arrayList.add(new MainActivity(R.drawable.em,"Ernest Miller Hemingway","Ernest Hemingway","Paris ","10"));
        arrayList.add(new MainActivity(R.drawable.xuanquynh,"Nguyễn Thị Xuân Quỳnh","Xuân Quỳnh ","Việ Nam ","10"));

        adapter = new AdapterActivity(HomeActivity.this,R.layout.activity_main,arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent();
                    intent.setClass(HomeActivity.this,DetailActivity.class);
                    startActivity(intent );

                }
                if(i==1){
                    Intent intent = new Intent();
                    intent.setClass(HomeActivity.this,DetailActivity2.class);
                    startActivity(intent );

                }
                if(i==2){
                    Intent intent = new Intent();
                    intent.setClass(HomeActivity.this,DetailActivity1.class);
                    startActivity(intent );

                }
            }
        });
    }

}