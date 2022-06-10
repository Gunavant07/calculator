package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String data ="";
    TextView text1;
    Button btn0,btn00,btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,btnc, btnplus, btnminus, btnmulti, btnequal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBinding();
        initOnClick();
    }

    void initBinding() {
        text1 = findViewById(R.id.text1);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btn00 = findViewById(R.id.btn00);

        btnc =findViewById(R.id.btnc);
        btnplus = findViewById(R.id.btnplus);
        btnminus = findViewById(R.id.btnminus);
        btnmulti = findViewById(R.id.btnmulti);
        btnequal = findViewById(R.id.btnequal);


    }

    void initOnClick() {

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "1");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "2");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "9");

            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "0");

            }
        });
        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "00");

            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "+");

            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "-");

            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "*");

            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                calculate();

            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text1.setText("");

            }
        });
    }
    void calculate()
    {
        int i,ps=0,j;
        String temp="",temp1="";
        for(i=0;i<data.length();i++)
        {
            if(data.charAt(i)=='+'||data.charAt(i)=='-'||data.charAt(i)=='*')
            {
                ps = i;
                System.out.println(temp);
                break;
            }
            else
            {
                temp=temp+data.charAt(i);
            }
        }
        for(j=ps +1;j<data.length();j++)
        {
            temp1 = temp1+data.charAt(j);
        }
        System.out.println(temp1);
        result(temp,temp1,data.charAt(ps));
    }
    void result(String t1,String t2,char sy)
    {
        int a = Integer.parseInt(t1);
        int b = Integer.parseInt(t2);
        System.out.println(a+b);
        switch (sy) {

            case '+':
                text1.setText("" + (a + b));
                Toast.makeText(MainActivity.this, "Answer is " + (a + b), Toast.LENGTH_SHORT).show();
                break;
            case '-':
                text1.setText(""+(a-b));
                Toast.makeText(MainActivity.this,"Answer is "+(a-b),Toast.LENGTH_SHORT).show();
                break;
            case '*':
                text1.setText(""+(a*b));
                Toast.makeText(MainActivity.this,"Answer is "+(a*b),Toast.LENGTH_SHORT).show();
                break;
        }
    }
}