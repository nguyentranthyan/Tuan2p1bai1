package com.example.tuan2p1bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText soa,sob;
TextView kq;
Button tong,hieu,tich,thuong,ucln,thoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soa=findViewById(R.id.EditText_soa);
        sob=findViewById(R.id.EditText_sob);
        kq=findViewById(R.id.textView_kq);
        tong=findViewById(R.id.button_tong);
        hieu=findViewById(R.id.button_hieu);
        tich=findViewById(R.id.button_tich);
        thuong=findViewById(R.id.button_thuong);
        ucln=findViewById(R.id.button_ucln);
        thoat=findViewById(R.id.button_thoat);

        tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(soa.getText().toString());
                float b=Float.parseFloat(sob.getText().toString());
                kq.setText(""+(a+b));
            }
        });
        hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(soa.getText().toString());
                float b=Float.parseFloat(sob.getText().toString());
                kq.setText(""+(a-b));
            }
        });
        tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(soa.getText().toString());
                float b=Float.parseFloat(sob.getText().toString());
                kq.setText(""+(a*b));
            }
        });
        thuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(soa.getText().toString());
                float b=Float.parseFloat(sob.getText().toString());
                kq.setText(""+(a/b));
            }
        });
        ucln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(soa.getText().toString());
                float b=Float.parseFloat(sob.getText().toString());
                if (a==0 ||b==0)
                    kq.setText(""+(a+b));
                while (a!=b)
                {
                    if(a>b)
                        a=a-b;
                    else
                        b=b-a;
                }
                kq.setText(""+a);
            }
        });
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
