package com.example.kub.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button b_tas,b_kagit,b_makas;
TextView skornot;
ImageView iv_cpu,iv_me;
String myChoise,cpuChoise,result;
Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        iv_cpu=(ImageView)findViewById(R.id.iv_cpu );
        iv_me=(ImageView)findViewById(R.id.iv_me);
        b_kagit=(Button)findViewById(R.id.b_paper);
        b_tas=(Button)findViewById(R.id.b_rock);
        b_makas=(Button)findViewById(R.id.b_scissors);
        r=new Random();
        b_kagit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          myChoise="kağıt";
          iv_me.setImageResource(R.drawable.paperyou);
          calculate();
            }
        });
        b_makas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           myChoise="makas";
                iv_me.setImageResource(R.drawable.scissors);
           calculate();
            }
        });
        b_tas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         myChoise="taş";
                iv_me.setImageResource(R.drawable.rockyou);
         calculate();
            }
        });

    }
    public void calculate(){
          int cpu=r.nextInt(3);
          if (cpu==0) {
            cpuChoise = "taş";
            iv_cpu.setImageResource(R.drawable.rock);
        }
        else if (cpu==1) {
            cpuChoise = "kağıt";
            iv_cpu.setImageResource(R.drawable.papercpu);
        }
      else if (cpu==2) {
            cpuChoise = "makas";
            iv_cpu.setImageResource(R.drawable.scissorscpu);
        }
        if(myChoise.equals("taş")&& cpuChoise.equals("kağıt"))
        {
            result="Kaybettin..";



        }
        if(myChoise.equals("taş")&& cpuChoise.equals("makas"))
        {
            result="Kazandın.";


        }
        if(myChoise.equals("kağıt")&& cpuChoise.equals("taş"))
        {
            result="Kazandın.";


        }
        if(myChoise.equals("kağıt")&& cpuChoise.equals("makas"))
        {
            result="Kaybettin.";


        }
        if(myChoise.equals("makas")&& cpuChoise.equals("kağıt"))
        {
            result="Kazandın.";

        }
        if(myChoise.equals("makas")&& cpuChoise.equals("taş"))
        {
            result="Kaybettin.";



        }
        if(myChoise.equals("makas")&& cpuChoise.equals("makas"))
        {
            result="Berabere.";


        }
        if(myChoise.equals("taş")&& cpuChoise.equals("taş"))
        {
            result="Berabere.";


        }
        if(myChoise.equals("kağıt")&& cpuChoise.equals("kağıt"))
        {
            result="Berabere.";


        }
        Toast.makeText(MainActivity.this,result,Toast.LENGTH_SHORT).show();



   }

    }

