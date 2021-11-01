
package ru.avalon.javapp.devj110.files;


public class Resolution {
    
    private int width;
    private int height;
   
       
    public Resolution(int width, int height) {
        setResolution(width, height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setResolution(int width, int height) {
        if ( height > 0 && width >0){
        this.height = height;
        this.width = width;
        }
        else{ 
            throw new IllegalArgumentException("ширина и высота изображения должны быть строго болшьше нуля");
        }
    }

    
@Override
    public String toString() {
    return width + "x" + height;
            }
}
    
    
  


    
    
    



    
    
  
   
    
    

