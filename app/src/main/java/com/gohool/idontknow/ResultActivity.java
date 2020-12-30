package com.gohool.idontknow;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ResultActivity extends AppCompatActivity {

    private TextView tv_result; //닉네임
    private ImageView tv_profile; //이미지

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String nickname = intent.getStringExtra("nickname"); //키값
        String photoUrl = intent.getStringExtra("photoUrl");


        tv_result = findViewById(R.id.textView);
        tv_result.setText(nickname);

        tv_profile = findViewById(R.id.ic_profile);
        Glide.with(this).load(photoUrl).into(tv_profile);// 프로필 url을 이미지 뷰에 세팅.

    }
}