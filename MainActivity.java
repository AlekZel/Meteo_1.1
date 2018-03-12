package com.zelenkin.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity   { //implements View.OnClickListener
    EditText kf1;
    EditText kf2;
    EditText kf3;
    EditText kf4;
    EditText kf5;
    EditText kf6;

    Button kno;
    TextView result;
    TextView result2;
    double kef1;
    double kef2;

    double kef3;
    double kef4;
    double kef5;
    double kef6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kf1 = (EditText) findViewById(R.id.kf1);
        kf2 = (EditText) findViewById(R.id.kf2);
        kf3 = (EditText) findViewById(R.id.kf3);
        kf4 = (EditText) findViewById(R.id.kf4);
        kf5 = (EditText) findViewById(R.id.kf5);
        kf6 = (EditText) findViewById(R.id.kf6);
        result = (TextView) findViewById(R.id.result);
        result2 = (TextView) findViewById(R.id.result2);
        final Button kno = findViewById(R.id.kno);
        kno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double num1;
                num1 = Double.valueOf(kf1.getText().toString());
                if (num1 >= -35 && num1 <= -32.2 || num1 >= 5.2 && num1 <= 25.2)

                    kef1 = -0.1;

                else if (num1 >= -32.1 && num1 <= 5.1 || num1 >= 25.3 && num1 <= 40)

                    kef1 = 0;

                double num2;
                num2 = Double.valueOf(kf2.getText().toString());
                if (num2 >= -15.9 && num2 <= -13.1 || num2 >= 30.3 && num2 <= 40)

                    kef2 = 0.1;

                else if (num2 >= -13 && num2 <= -5 || num2 >= 16.1 && num2 <= 30.2)

                    kef2 = 0;

                else if (num2 >= -4.9 && num2 <= 16)

                    kef2 = -0.1;

                double num3;
                num3 = Double.valueOf(kf3.getText().toString());
                if (num3 >= -27.4 && num3 <= -22.5 || num3 >= -17.4 && num3 <= -12.5 || num3 >= 5.1 && num3 <= 35.0)

                    kef3 = 0.1;

                else if (num3 >= -12.4 && num3 <= -5 || num3 >= 35.1 && num3 <= 40)

                    kef3 = 0;

                else if (num3 >= -22.4 && num3 <= -17.5)

                    kef3 = 0.2;

                double num4;
                num4 = Double.valueOf(kf4.getText().toString());
                if (num4 >= -27.4 && num4 <= -22.5 || num4 >= -17.4 && num4 <= -12.5 || num4 >= 5.1 && num4 <= 35.0)

                    kef4 = 0.1;

                else if (num4 >= -12.4 && num4 <= -5 || num4 >= 35.1 && num4 <= 40)

                    kef4 = 0;

                else if (num4 >= -22.4 && num4 <= -17.5)

                    kef4 = 0.2;


                double num5;
                num5 = Double.valueOf(kf5.getText().toString());
                if (num5 >= -21.6 && num5 <= -10)

                    kef5 = 0.2;

                else if (num5 >= -9.9 && num5 <= -6)

                    kef5 = -0.1;

                else if (num5 >= -1.9 && num5 <= 5)

                    kef5 = 0.1;

                else if (num5 >= -5.9 && num5 <= -2 || num5 >= 5.1 && num5 <= 50)

                    kef5 = 0;

                double num6;
                num6 = Double.valueOf(kf6.getText().toString());
                if (num6 >= -21.6 && num6 <= -10)

                    kef6 = 0.2;

                else if (num6 >= -9.9 && num6 <= -6)

                    kef6 = -0.1;

                else if (num6 >= -1.9 && num6 <= 5)

                    kef6 = 0.1;

                else if (num6 >= -5.9 && num6 <= -2 || num6 >= 5.1 && num6 <= 50)

                    kef6 = 0;




                result.setText(       kef1 + "\n" + "\n" +
                                      kef2 + "\n" + "\n" +
                                      kef3 + "\n" + "\n" +
                                      kef4 + "\n" + "\n" +
                                      kef5 + "\n" + "\n" +
                                      kef6 + "\n"
                                );

                double ispr[] = new double[6];
                 ispr[0] = num1 + kef1;
                 ispr[1] = num2 + kef2;
                 ispr[2] = num3 + kef3;
                 ispr[3] = num4 + kef4;
                 ispr[4] = num5 + kef5;
                 ispr[5] = num6 + kef6;

                 String n[] = new String[6];

                String pattern = "##0.0";
                DecimalFormat decimalFormat = new DecimalFormat(pattern);
                for (int i=0; i<6; i++) {
                    n[i] = decimalFormat.format(ispr[i]);
                }

                result2.setText(n[0] + "\n" + "\n" +
                                n[1] + "\n" + "\n" +
                                n[2] + "\n" + "\n" +
                                n[3] + "\n" + "\n" +
                                n[4] + "\n" + "\n" +
                                n[5] + "\n"

                );
            }
        });
    }
}




