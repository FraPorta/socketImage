package com.example.provasocket;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText)findViewById(R.id.editText);

    }

    public void send(View v){
        // get image to be sent
        ImageView imageView=(ImageView) findViewById(R.id.imageView);
        Bitmap bmp=((BitmapDrawable)imageView.getDrawable()).getBitmap();

        SocketClient socketClient = new SocketClient();
        socketClient.execute(bmp);
        Toast.makeText(getApplicationContext(), "Socket task started", Toast.LENGTH_SHORT).show();

    }
}