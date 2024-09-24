package com.example.lab11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class detail extends AppCompatActivity { // Use CamelCase for class name
    ImageView background;
    Button back;
    String url = "https://www.marthastewart.com/thmb/e_3vMeXZ4DC6EwXeGu74_tdXZpM=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/the-8-paint-color-trends-youre-about-to-see-everywhere-in-2023-3-1222-2000-2814536f561d4241ac89c0d817340218.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(detail.this, MainActivity.class);
                startActivity(back);
            }
        });

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String img = intent.getStringExtra("img");
        String dob = intent.getStringExtra("dob");
        String tel = intent.getStringExtra("tel");


        background = findViewById(R.id.background);
        Glide.with(this).load(url).into(background);


        ImageView imageView = findViewById(R.id.friend_img);
        Glide.with(this) // Use 'this' for context
                    .load(img) // Load image from 'img'
//                    .placeholder(R.drawable.ic_launcher_background)
//                    .error(R.drawable.ic_launcher_background)
                    .into(imageView);
//        } else {
//            imageView.setImageResource(R.drawable.ic_launcher_background);
//        }

        TextView textView = findViewById(R.id.friend_name);
        TextView textView2 = findViewById(R.id.friend_tel);
        textView2.setText("เบอร์โทรศัพท์: " + tel); // Set text from 'tel'
        textView.setText("ชื่อ: " + name); // Set text from 'name'

        TextView textView3 = findViewById(R.id.friend_dob);
        textView3.setText("วันเกิด: " + dob); // Set text from 'dob'

        TextView textView4 = findViewById(R.id.Detail);
        textView4.setText("รายละเอียด:");

    }
}