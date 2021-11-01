/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.avalon.javapp.devj110.files;
//import java.time.Duration;
//import java.time.format.DateTimeFormatter;
/**
 *
 * @author bezdetk0@mail.ru
 */
public class Time {
    
    private long seconds;

    public Time(long seconds) {
        setSeconds(seconds);
    }


    public long getSeconds() {
        return seconds;
    }

    public void setSeconds(long seconds) {
        if (seconds <= 0)
            throw new IllegalArgumentException("Время в секундах должно строго больше нуля");
        this.seconds = seconds;
    }



    private static String timeToString(long seconds) {
        long hour = seconds / 3600,
                min = seconds / 60 % 60,
                sec = seconds / 1 % 60;
        if (seconds/3600 == 0 && (seconds / 60 % 60) == 0){
        return String.format("%02d", sec);
        }
        else if (seconds/3600 == 0) {
        return String.format("%02d:%02d", min, sec);
        }
        else {
        return String.format("%02d:%02d:%02d", hour, min, sec);
        }             
            
    }
    
    public String getTime(){
        return timeToString(seconds);
    }
}
    
