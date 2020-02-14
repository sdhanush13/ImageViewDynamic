package com.example.imageviewdyna;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = new LinearLayout(getApplicationContext());
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.hello);
        layout.addView(imageView);
        setContentView(layout);
    }
}
