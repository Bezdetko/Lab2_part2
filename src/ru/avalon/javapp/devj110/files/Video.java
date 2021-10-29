package ru.avalon.javapp.devj110.files;

public class Video extends Multimedia{

    private Resolution resolution;

    public Video(String name, int size, Format format, String info, Time time, Resolution resolution) {
        super(name, size, format, info, time);
        setResolution(resolution);
    }
    
        public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        if(resolution == null)
            throw new IllegalArgumentException("Разрешение не должно быть пустой ссылкой");
        this.resolution = resolution;
    }
    
            @Override
    public String getDetails() {
              
        return getInfo() + " " + getTime().getTime() + " " + resolution;
    }
        
}
