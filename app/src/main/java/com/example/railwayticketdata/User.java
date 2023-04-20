package com.example.railwayticketdata;

import java.io.Serializable;

public class User implements Serializable {
    // поля
    private String nameId;
    private String departurePoint;
    private String arrivalPoint;
    private String departureTime;
    private String arrivalTime;
    private String ticketPrice;

    //конструктор
    public User(String nameId, String departurePoint, String arrivalPoint, String departureTime, String arrivalTime, String ticketPrice) {
        this.nameId = nameId;
        this.departurePoint = departurePoint;
        this.arrivalPoint = arrivalPoint;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.ticketPrice = ticketPrice;
    }
    // переопределение метода toString
    @Override
    public String toString() {
        return "Данные железнодорожного билета:\n" +
                "Идентификатор пасажира " + nameId + "\n" +
                "Место отправления поезда " + departurePoint + "\n" +
                "Место прибытие поезда " + arrivalPoint + "\n" +
                "Время отправления поезда " + departureTime + "\n" +
                "Время прибытия поезда " + arrivalTime + "\n" +
                "Стоимость билета" + ticketPrice;
    }
}
