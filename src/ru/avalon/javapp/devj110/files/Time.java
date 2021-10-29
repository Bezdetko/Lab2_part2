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
//    private int minutes;
//    private int hours;
    public Time(long seconds) {
        setSeconds(seconds);
    }

//    public Time(int seconds, int minutes) {
//        this(seconds);
//        setMinutes(minutes);
//    }
//    
//    
//    
//
//    public Time(int hours, int minutes, int seconds) {
//        this(seconds, minutes);
//        getTime(seconds);
//    }

    public long getSeconds() {
        return seconds;
    }

    public void setSeconds(long seconds) {
        if (seconds <= 0)
            throw new IllegalArgumentException("Время в секундах должно строго больше нуля");
        this.seconds = seconds;
    }

//    public int getMinutes() {
//        return minutes;
//    }
//
//    public void setMinutes(int minutes) {
//        this.minutes = minutes;
//    }
//
//    public int getHours() {
//        return hours;
//    }
//
//    public void setHours(int hours) {
//        this.hours = hours;
//    }

//@Override
//    public String toString() {
//        
//        return seconds/3600 + ":" + (seconds%3600/60) + ":" + (seconds%60);
//                            }      
//       public Duration getDuration() {
//        return Duration.ofSeconds(seconds);
//    }

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
    

    
//    @Override    
//        public String toString() {
//        if (seconds/3600 == 0 && (seconds%3600/60) == 0){
//            return "" + seconds%60;
//        }
//        
//        else if (seconds/3600 == 0) {
//           return "" + (seconds%3600/60) + ":" + (seconds%60);
//        }
//        else return seconds/3600 + ":" + (seconds%3600/60) + ":" + (seconds%60); 
//        }
//
//     
}


