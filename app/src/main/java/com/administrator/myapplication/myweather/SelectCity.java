package com.administrator.myapplication.myweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.administrator.myapplication.R;

public class SelectCity extends AppCompatActivity implements View.OnClickListener{


    private  ImageView mBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_city);
        mBackBtn = (ImageView) findViewById(R.id.title_back);
        mBackBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
            switch (view.getId()){
                case R.id.title_back:
                    finish();
                    break;
                default:
                    break;
            }
    }


}
