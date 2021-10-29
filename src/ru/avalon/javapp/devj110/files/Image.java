package ru.avalon.javapp.devj110.files;

public class Image extends File{
    
private Resolution resolution;    


    public Image(String name, int size, Format format, Resolution resolution) {
        super(name, size, format);
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
              
        return "image " + resolution;
    }
    
}
