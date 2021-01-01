package com.example.myapplication26;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity6 extends AppCompatActivity {
    ImageView iv;
    String[] names;
    int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Intent z=getIntent();
        iv = findViewById(R.id.imageView2);
        AssetManager assets = getAssets();
        try {
            names = assets.list("cars");
        }
        catch (IOException e) {
            Toast.makeText(this, "Error",Toast.LENGTH_SHORT).show();
        }

    }

    public void btnnext(View view) {
        if (index > names.length-1) this.index = 0;
        loadImageFromAssets(iv, names[index]);
        index++;
    }

    public void btnback(View view) {
        if (index < 0) index = names.length - 1;
        loadImageFromAssets(iv, names[index]);
        index--;
    }
    private void loadImageFromAssets(ImageView imgView, String st){
        AssetManager a = getAssets();
        InputStream stream;
        try {
            stream = a.open("cars/" + st);
            Drawable dr = Drawable.createFromStream(stream, null);
            imgView.setImageDrawable(dr);
        }
        catch (IOException e){
            Toast.makeText(this, "Error Loading..",Toast.LENGTH_SHORT).show();
        }
    }
}