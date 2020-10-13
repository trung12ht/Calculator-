package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;

    Button daumux, daucong,
        dautru, daunhan, dauchia;

    Button begincongtru;

    Button giuacham;

    Button bang;

    Button AC, C;

    TextView so, dau;

    String pre, now;

    String kitu = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        daumux = (Button) findViewById(R.id.daumux);
        daucong = (Button) findViewById(R.id.daucong);
        dautru = (Button) findViewById(R.id.dautru);
        daunhan = (Button) findViewById(R.id.daunhan);
        dauchia = (Button) findViewById(R.id.dauchia);
        begincongtru = (Button) findViewById(R.id.begincongtru);
        giuacham = (Button) findViewById(R.id.giuacham);
        bang = (Button) findViewById(R.id.bang);
        AC = (Button) findViewById(R.id.AC);
        C = (Button) findViewById(R.id.C);
        so = (TextView) findViewById(R.id.so);
        dau = (TextView) findViewById(R.id.dau);

        giuacham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.setText(so.getText() + ".");
                now = (String) so.getText();
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.setText(so.getText() + "0");
                now = (String) so.getText();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.setText(so.getText() + "1");
                now = (String) so.getText();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.setText(so.getText() + "2");
                now = (String) so.getText();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.setText(so.getText() + "3");
                now = (String) so.getText();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.setText(so.getText() + "4");
                now = (String) so.getText();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.setText(so.getText() + "5");
                now = (String) so.getText();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.setText(so.getText() + "6");
                now = (String) so.getText();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.setText(so.getText() + "7");
                now = (String) so.getText();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.setText(so.getText() + "8");
                now = (String) so.getText();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so.setText(so.getText() + "9");
                now = (String) so.getText();
            }
        });

        daucong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kitu="+";
                dau.setText(kitu);
                pre=now;
                now="";
                so.setText(now);
            }
        });

        dautru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kitu="-";
                dau.setText(kitu);
                pre=now;
                now="";
                so.setText(now);
            }
        });

        daunhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kitu="*";
                dau.setText(kitu);
                pre=now;
                now="";
                so.setText(now);
            }
        });

        dauchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kitu="/";
                dau.setText(kitu);
                pre=now;
                now="";
                so.setText(now);
            }
        });

        daumux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kitu="^";
                dau.setText(kitu);
                pre=now;
                now="";
                so.setText(now);
            }
        });

        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kitu.equals("+")) {
                    now = String.valueOf(Float.parseFloat(pre)+ Float.parseFloat(now));
                    pre="";
                }
                if (kitu.equals("-")) {
                    now = String.valueOf(Float.parseFloat(pre)- Float.parseFloat(now));
                    pre="";
                }
                if (kitu.equals("*")) {
                    now = String.valueOf(Float.parseFloat(pre)* Float.parseFloat(now));
                    pre="";
                }
                if (kitu.equals("/")) {
                    now = String.valueOf(Float.parseFloat(pre)/ Float.parseFloat(now));
                    pre="";
                }
                if (kitu.equals("^")) {
                    now = String.valueOf(Math.pow(Float.parseFloat(pre), Float.parseFloat(now)));
                    pre="";
                }
                DecimalFormat df = new DecimalFormat("#.##");
                String formatted = df.format(Float.parseFloat(now));
                now=formatted;
                so.setText(formatted);
                kitu="";
                dau.setText(kitu);
            }
        });

        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pre="";
                now="";
                so.setText(now);
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((now != null) && (now.length() > 0)) {
                    now = now.substring(0, now.length() - 1);
                }
                so.setText(now);
            }
        });

        begincongtru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (now.charAt(0)=='-') {
                    now=now.substring(1, now.length());
                }
                else now ="-"+now;
                so.setText(now);
            }
        });

    }
}
