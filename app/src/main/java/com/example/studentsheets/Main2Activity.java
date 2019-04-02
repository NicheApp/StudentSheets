package com.example.studentsheets;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {
int position,position2,position3;
  String link,a;

    public void ct1(View v1)
    {

     if(position3==2){
         link="https://drive.google.com/open?id=1_TFOv7Fb-yOT4SW1bzZ4cNtFY-vz7L39";
         web(link);
     }
     else if(position3==3)
     {
         link="";
         web(link);
     }

        else if(position3==4)
        {
            link="";
            web(link);
        }

         else if(position3==5)
        {
            link="";
            web(link);
        }

       else if(position3==6)
        {
            link="";
            web(link);
        }

        else if(position3==7)
        {
            link="https://drive.google.com/open?id=19jEqGxE4-ardrW8vyqgkNzyqx9ZHXeKv";
            web(link);
        }
        }
    public void ct2(View v2)
    {
        if(position3==2){
            link="https://drive.google.com/open?id=1c_zoszROEFtfohKmWt3UBXUa97DXWP7U";
            web(link);
        }
        else if(position3==3)
        {
            link="https://drive.google.com/open?id=1h5IOb4jhcy-24GDBdHem299rrmylcQiv";
            web(link);
        }

        else if(position3==4)
        {
            link="";
            web(link);
        }

        else if(position3==5)
        {
            link="";
            web(link);
        }

        else if(position3==6)
        {
            link="";
            web(link);
        }

        else if(position3==7)
        {
            link="";
            web(link);
        }

    }
    public void ct3(View v)
    {
        if(position3==2){
            link="https://drive.google.com/open?id=1lY8TE4i_kWdAU2XgstcwSktV6rYjy7Xf";
            web(link);
        }
        else if(position3==3)
        {
            link="";
            web(link);
        }

        else if(position3==4)
        {
            link="";
            web(link);
        }

        else if(position3==5)
        {
            link="";
            web(link);
        }

        else if(position3==6)
        {
            link="";
            web(link);
        }

        else if(position3==7)
        {
            link="";
            web(link);
        }

    }  public void univ(View v)
    {
        if(position3==2){
            link="https://drive.google.com/open?id=1b_qFbZEljUoxh_HM-_jR1oph2GgDP2kT";
            web(link);
        }
        else if(position3==3)
        {
            link="https://drive.google.com/open?id=1UCqj-i6vnF0kgmIWQM6S3MSP1RsndOqN";
            web(link);
        }

        else if(position3==4)
        {
            link="";
            web(link);
        }

        else if(position3==5)
        {
            link="";
            web(link);
        }

        else if(position3==6)
        {
            link="";
            web(link);
        }

        else if(position3==7)
        {
            link="";
            web(link);
        }

    }
    public void web(String a)
    {
        Uri uri = Uri.parse(link); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        position= getIntent().getIntExtra("this",0);
        position2= getIntent().getIntExtra("this2",0);
        position3= getIntent().getIntExtra("this3",0);
    }
}
