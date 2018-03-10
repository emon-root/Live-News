package com.shadhinsoft.livenews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button prothom, bdlive, bdnews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prothom = (Button) findViewById(R.id.prothomAlo);
        bdlive = (Button) findViewById(R.id.bdlive);
        bdnews = (Button) findViewById(R.id.bdnews24);

        prothom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.prothomalo.com/";
                Intent i = new Intent(MainActivity.this, WebViewHandler.class);
                i.putExtra("Emon", url);
                startActivity(i);
            }
        });
        bdnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://bangla.bdnews24.com/";
                Intent i = new Intent(MainActivity.this, WebViewHandler.class);
                i.putExtra("Emon", url);
                startActivity(i);
            }
        });
        bdlive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.banglanews24.com/";
                Intent i = new Intent(MainActivity.this, WebViewHandler.class);
                i.putExtra("Emon", url);
                startActivity(i);
            }
        });

    }
}
