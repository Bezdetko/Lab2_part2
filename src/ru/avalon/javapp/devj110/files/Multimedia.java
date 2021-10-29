/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.avalon.javapp.devj110.files;

/**
 *
 * @author bezdetk0@mail.ru
 */
public class Multimedia extends File {
private String info;
private Time time;
    

    public Multimedia(String name, int size, Format format, String info, Time time) {
        super(name, size, format);
        setInfo(info);
        setTime(time);
        
        };

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        if(info == null || info.trim().equals(""))
            throw new IllegalArgumentException("Описание  мультимедиа файла не должно быть пустой ссылкой или незаполненной строкой.");
        this.info = info;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

       
@Override
    public String getDetails() {
              
        return info + ", " + time.getTime();
    
}
}
