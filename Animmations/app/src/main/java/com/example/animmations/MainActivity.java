package com.example.animmations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Animation(View view) {
        ImageView imageView=findViewById(R.id.imageView);
       // imageView.animate().alpha(0).setDuration(2000);
       // imageView.animate().translationYBy(250).setDuration(5000);
        //imageView.animate().translationXBy(250).setDuration(5000);
       // imageView.animate().translationXBy(-250).setDuration(5000);
       // imageView.animate().translationYBy(-250).setDuration(5000);

        imageView.animate().rotation(720).alpha(0).setDuration(5000);

        imageView.animate().rotation(720).scaleX(0.5f).scaleY(0.5f).setDuration(5000);
    }
}