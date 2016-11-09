package com.example.zhoujian.myfrescodemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.zhoujian.myfrescodemo.R;
import com.squareup.picasso.Picasso;


/**
 * fresco是壁画的意思  Android最好用、最强大的图片加载框架
 *
 */

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Picasso.with(MainActivity.this).load("");


    }
}
