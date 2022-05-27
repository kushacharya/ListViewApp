package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    private String arr[] = {"Item 1","Item2","Item2","Item3","Item4","Item5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
// ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,arr);
// listView.setAdapter(ad);
        Kushclass ad = new Kushclass(this,R.layout.mylayout,arr);
        listView.setAdapter(ad);
    }
}