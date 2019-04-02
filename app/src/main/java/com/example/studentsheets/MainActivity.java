package com.example.studentsheets;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

 public int position,position2,position3;
    public void get(View v) {
openMain2Activity();






    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         final Spinner spinner1 = findViewById(R.id.spinner1);
        final Spinner spinner2 =  findViewById(R.id.spinner2);
        final Spinner spinner3=findViewById(R.id.spinner3);
        List<String> list = new ArrayList<String>();
        list.add("Select Branch");
        list.add("Computer Science");
        list.add("Electronics");
        list.add("Electrical");
        list.add("Mechanical");
        list.add("Automobiles");
        list.add("Aerospace");
        list.add("Bio Technology");
        final List<String> list2 = new ArrayList<String>();
        list2.add("Select semester");

        final List<String> list3 = new ArrayList<String>();
        list3.add("Select Course");

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                list);
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                list2);
        ArrayAdapter<String> myAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                list3);
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(myAdapter);
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(myAdapter2);
        myAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(myAdapter3);

        //For Spinner1;
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
               MainActivity.this.position= spinner1.getSelectedItemPosition()+1;
               Log.i("position",position+"");
               if(position>1) {
                   list2.add("Semester 1");
                   list2.add("Semester 2");
                   list2.add("Semester 3");
                   list2.add("Semester 4");
                   list2.add("Semester 5");
                   list2.add("Semester 6");
                   list2.add("Semester 7");
                   list2.add("Semester 8");
               }



           }
           @Override
           public void onNothingSelected(AdapterView<?> parent) { }});

       //For Spinner2;
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                MainActivity.this.position2= spinner2.getSelectedItemPosition()+1;
                if(position2>1)
                {
                    if(position==2) {
                        if (position2 == 2) {
                            list3.add("Physics");
                            list3.add("Maths");
                            list3.add("Basic Electrical and Electronics");
                            list3.add("Engineering Graphics");
                            list3.add("English");
                            list3.add("Constitution of India");
                        }
                        if (position2 == 3) {
                            list3.add("Chemistry");
                            list3.add("Maths");
                            list3.add("Programming for Problem solving");
                            list3.add("General aptitude");
                            list3.add("Civil and Mechanical");
                        }

                    }

                }
            }@Override
            public void onNothingSelected(AdapterView<?> parent) { }});

        //For Spinner3;
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                MainActivity.this.position3= spinner3
                        .getSelectedItemPosition()+1; }
                        @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

Log.i("THE",position + position2 + position3 +"");

    }


public void openMain2Activity()
    {
        Intent intent =new Intent(this,Main2Activity.class);

        intent.putExtra("this",position);
        intent.putExtra("this2",position2);
        intent.putExtra("this3",position3);

        startActivity(intent);


    }


}
