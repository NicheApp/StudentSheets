package com.example.studentsheets;
import android.content.Intent;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class MainActivity extends AppCompatActivity {

 public int position,position2,position3;
 String link;
    public void get(View v) {
        googleDrive();
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
                            list3.clear();
                            list3.add("Physics");
                            list3.add("Maths");
                            list3.add("Basic Electrical and Electronics");
                            list3.add("Engineering Graphics");
                            list3.add("English"); }
                        if (position2 == 3) {
                            list3.clear();
                            list3.add("Chemistry");
                            list3.add("Maths");
                            list3.add("Programming for Problem solving");
                            list3.add("language");

                        }

                    }

                    if(position==3  || position==4 || position==5) {
                        if (position2 == 2 ) {
                            list3.clear();
                            list3.add("Chemistry");
                            list3.add("Maths");
                            list3.add("Programming for Problem solving");
                            list3.add("language");
                            }
                        if (position2 == 3) {
                            list3.clear();
                            list3.add("Physics");
                            list3.add("Maths");
                            list3.add("Basic Electrical and Electronics");
                            list3.add("Engineering Graphics");
                            list3.add("English");

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



public void  googleDrive()
{
    if(position==2)
    {
        if(position2==2)
        {
            if(position3==1)
            { link="https://drive.google.com/open?id=118WiWwjDgg6Mazn98hdgM51L4Y-lvaVW"; web(link);}
            if(position3==2)
            {link="https://drive.google.com/open?id=1-7QC0TfEQxavIVhwnLZ9Nod3WgMEwZdo";web(link);}
            if(position3==3)
            { link="https://drive.google.com/open?id=1-J9ovay13RLLovVoVnKed1REqEtFUP8m"; web(link);}
            if(position3==4)
            {link="https://drive.google.com/open?id=1-TN5yTHrEDw1Ba9ons7Fgz7QTV0Uju1I";web(link);}
            if(position3==5)
            { link="https://drive.google.com/open?id=1-Xi9PlThheGCUwdFzflygpSsOH-bNtNb"; web(link);}
            if(position3==7)
            {link="";web(link);}
        }
        if(position2==3)
        {
            if(position3==1)
            { link="https://drive.google.com/open?id=1-jswOgEkXv-ET4M1E3yAO_1-ex2QtM6W"; web(link);}
            if(position3==2)
            {link="https://drive.google.com/open?id=1-lItIZTmgtm_xba-g3NbdLgtCyNRGNyr";web(link);}
            if(position3==3)
            { link="https://drive.google.com/open?id=1-baHW4vfTZQYsP0wMjcpKghTRyvOItRY"; web(link);}
            if(position3==4)
            {link="https://drive.google.com/open?id=1-r_FU4dfHK28544HWtVIPDN5oOPhXvTG";web(link);}
            if(position3==5)
            { link=""; web(link);}
            if(position3==7)
            {link="";web(link);}
        }
    }
    if(position==3 || position==4 || position==5)
    {
        if(position2==3)
        {
            if(position3==1)
            { link="https://drive.google.com/open?id=118WiWwjDgg6Mazn98hdgM51L4Y-lvaVW"; web(link);}
            if(position3==2)
            {link="https://drive.google.com/open?id=1-7QC0TfEQxavIVhwnLZ9Nod3WgMEwZdo";web(link);}
            if(position3==3)
            { link="https://drive.google.com/open?id=1-J9ovay13RLLovVoVnKed1REqEtFUP8m"; web(link);}
            if(position3==4)
            {link="https://drive.google.com/open?id=1-TN5yTHrEDw1Ba9ons7Fgz7QTV0Uju1I";web(link);}
            if(position3==5)
            { link="https://drive.google.com/open?id=1-Xi9PlThheGCUwdFzflygpSsOH-bNtNb"; web(link);}
            if(position3==6)
            {link="";web(link);}
        }
        if(position2==2)
        {
            if(position3==1)
            { link="https://drive.google.com/open?id=1-jswOgEkXv-ET4M1E3yAO_1-ex2QtM6W"; web(link);}
            if(position3==2)
            {link="https://drive.google.com/open?id=1-lItIZTmgtm_xba-g3NbdLgtCyNRGNyr";web(link);}
            if(position3==3)
            { link="https://drive.google.com/open?id=1-baHW4vfTZQYsP0wMjcpKghTRyvOItRY"; web(link);}
            if(position3==4)
            {link="https://drive.google.com/open?id=1-r_FU4dfHK28544HWtVIPDN5oOPhXvTG";web(link);}
            if(position3==5)
            { link=""; web(link);}
            if(position3==7)
            {link="";web(link);}
        }
    }
}
    public void web(String a)
    {
        Uri uri = Uri.parse(link); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);


    }

}
