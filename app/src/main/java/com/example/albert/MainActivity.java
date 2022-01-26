package com.example.albert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {
ImageView iv1;
Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1 = findViewById(R.id.imageView);
        click = findViewById(R.id.button4);
    }

    public void Clicked(View view) {
        int random = (int)(101*Math.random())%3+1;
        if(random == 1)
            iv1.setImageResource(R.drawable.one);
        else if(random == 2)
            iv1.setImageResource(R.drawable.two);
        else if(random == 3)
            iv1.setImageResource(R.drawable.three);
    }
}