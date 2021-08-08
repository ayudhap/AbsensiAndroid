package com.example.absensiandroid;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.absensiandroid.entity.Absensi;

import in.mayanknagwanshi.imagepicker.ImageSelectActivity;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class CheckInActivity extends AppCompatActivity {
    public ImageView ivFoto;
    public Button btnFoto;
    private int requestCode = 1;
    RequestBody requestBody, data;
    String mediaPath;
    MultipartBody.Part fileToUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);
        ivFoto = findViewById(R.id.iv_foto);
        btnFoto = findViewById(R.id.btn_done);

        btnFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ImageSelectActivity.class);
                intent.putExtra(ImageSelectActivity.FLAG_CAMERA, true);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (this.requestCode == requestCode && resultCode == RESULT_OK) {
            mediaPath = data.getStringExtra(ImageSelectActivity.RESULT_FILE_PATH);
            ivFoto.setImageBitmap(BitmapFactory.decodeFile(mediaPath));
            Intent intent = new Intent(CheckInActivity.this, CheckInSucceed.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(CheckInActivity.this, CheckInFailed.class);
            startActivity(intent);
        }
    }

    protected void onUploadProgress() {

    }
}