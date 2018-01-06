package com.myfish.uiwidgettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edittext1;
    private EditText edittext2;
    private ImageView iv;
    private ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 =(Button)findViewById(R.id.button1);
        Button button2 =(Button)findViewById(R.id.button2);
        Button button3 =(Button)findViewById(R.id.button3);
        Button button4 =(Button)findViewById(R.id.button4);

        edittext1 = (EditText) findViewById(R.id.no1);
        edittext2 = (EditText) findViewById(R.id.no2);

        iv = (ImageView)findViewById(R.id.iv);

        pb = (ProgressBar)findViewById(R.id.pb);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int i1 = Integer.parseInt( edittext1.getText().toString());
                int i2 = Integer.parseInt( edittext2.getText().toString());
                int i3 = i1+i2;
                String s3 = i3+"";

                Toast.makeText(MainActivity.this, s3, Toast.LENGTH_SHORT).show();
                iv.setImageResource(R.drawable.img222);
                pb.setVisibility(View.VISIBLE);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i1 = Integer.parseInt( edittext1.getText().toString());
                int i2 = Integer.parseInt( edittext2.getText().toString());
                int i3 = i1-i2;
                String s3 = i3+"";

                Toast.makeText(MainActivity.this, s3, Toast.LENGTH_SHORT).show();
                pb.setVisibility(View.INVISIBLE);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int i1 = Integer.parseInt( edittext1.getText().toString());
                int i2 = Integer.parseInt( edittext2.getText().toString());
                int i3 = i1*i2;
                String s3 = i3+"";

                Toast.makeText(MainActivity.this, s3, Toast.LENGTH_SHORT).show();
                int progress = pb.getProgress();
                progress+=10;
                pb.setProgress(progress);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float i1 = Float.parseFloat( edittext1.getText().toString());
                float i2 = Float.parseFloat( edittext2.getText().toString());
                float i3 = i1/i2;
                String s3 = i3+"";

                Toast.makeText(MainActivity.this, s3, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
