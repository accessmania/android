package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public int[] data ={1,2,3,4,5};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)  findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ListView lv = (ListView) findViewById(R.id.list);



                ArrayAdapter ad = new ArrayAdapter(this,R.layout.listview_viewer , data);


                lv.setAdapter(ad);

                Intent i = new Intent(getApplicationContext(),second.class );

                startActivity(i);





            }
        });



    }



}