package com.example.railwayticketdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    // поле
    private TextView ticketInfo;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ticketInfo = findViewById(R.id.ticketInfo);

        Bundle bundle = getIntent().getExtras();
        user = (User) bundle.getSerializable(User.class.getSimpleName());

        ticketInfo.setText(user.toString());
    }
}