package com.example.railwayticketdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // создание полей
    private EditText nameId;
    private EditText departurePoint;
    private EditText arrivalPoint;
    private EditText departureTime;
    private EditText arrivalTime;
    private TextView ticketPrice;
    private Button button;

    private String nameIdSt;
    private String departurePointSt;
    private String arrivalPointSt;
    private String departureTimeSt;
    private String arrivalTimeSt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка к разметке, полями к id
        nameId = findViewById(R.id.nameId);
        departurePoint = findViewById(R.id.departurePoint);
        arrivalPoint = findViewById(R.id.arrivalPoint);
        departureTime = findViewById(R.id.departureTime);
        arrivalTime = findViewById(R.id.arrivalTime);
        ticketPrice = findViewById(R.id.ticketPrice);
        button = findViewById(R.id.button);


        //вывод информации о стоимости билетов
        ticketPrice.setText("5 рублей");
    }
    // обработка нажатия кнопки
    public void onClickTicket(View view){
    // считывание данных с экрана
        nameIdSt = nameId.getText().toString();
        departurePointSt = departurePoint.getText().toString();
        arrivalPointSt = arrivalPoint.getText().toString();
        departureTimeSt = departureTime.getText().toString();
        arrivalTimeSt = arrivalTime.getText().toString();

    // создание объекта сущности пассажира
        User user = new User(nameIdSt, departurePointSt, arrivalPointSt, departureTimeSt, arrivalTimeSt, ticketPrice.getText().toString());

    // создание намерения
    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
    intent.putExtra(User.class.getSimpleName(), user);
    startActivity(intent);

    }
}