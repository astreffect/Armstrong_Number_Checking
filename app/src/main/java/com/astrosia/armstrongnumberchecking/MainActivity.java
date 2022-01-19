package com.astrosia.armstrongnumberchecking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.*;

public class MainActivity extends AppCompatActivity {

    EditText editnum;
    TextView result;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editnum  = (EditText) findViewById(R.id.editTextNumber);
        result = (TextView) findViewById(R.id.textView2);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String value= editnum.getText().toString();
                int finalValue=Integer.parseInt(value);
                String r=armstrong(finalValue);
                result.setText(" The Number is: "+r);
                sum=0.0;
            }
        });
    }
    double sum=0.0;
    String armstrong(int x)
    {

        String srm="";
        int c=0;
        int cx=x;
        while(cx>0)
        {
            cx=cx/10;
            c++;
        }
        cx=x;
        while(cx>0)
        {
            int d=cx%10;
            cx=cx/10;
            sum=sum+Math.pow(d,c);
            
        }
        int xrs=(int)(sum+0);

        if (x==xrs)
        {
            srm="Armstrong Number";
        }
        else
        {
            srm="Not An Armstrong Number";
        }


        return srm;
    }
}