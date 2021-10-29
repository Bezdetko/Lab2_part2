
package ru.avalon.javapp.devj110.files;


public class Resolution {
    
    private int width;
    private int height;
   
       
//
    public Resolution(int width, int height) {
        setResolution(width, height);
    }
////    
       
    

//    public int getWidth() {
//        
//        return width;
//    }
//
//    public int getHeight() {
//        
//        return height;
//    }
//
//   public void setResolution (int width, int height) {
//       if (width <= 0 || height <=0)
//            throw new IllegalArgumentException("width and  must be > 0");
//        this.width = width;
//        this.height = height;
//    }
//    
    
//    public Resolution(int width, int height) {
//        setWidth(width);
//        setHeight(height);
//    }
//    
//    
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        if (width <=0)
//            throw new IllegalArgumentException("width must be > 0");
//        this.width = width;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        if (height <=0)
//            throw new IllegalArgumentException("height must be > 0");
//        this.height = height;
//    }
    

    
//    
//    public Resolution(int width, int height) {
//        setWidth(width);
//        setHeight(height);
//    }

    public int getWidth() {
        return width;
    }
//
//    public void setWidth(int width) {
//        if (width<=0) throw new IllegalArgumentException("width must be >0");
//        this.width = width;
//    }

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

//    public void setHeight(int height) {
//        if (height<=0) throw new IllegalArgumentException("height must be >0");
//        this.height = height;
//    }
    
@Override
    public String toString() {
    return width + "x" + height;
            }
}
    
    
  
//    private Resolution(int width, int height) {
//        this.width = getWidth();
//        this.height = getHeight();
//    }

//    public int getWidth() {
//        return width;
//    }
//
//    public int getHeight() {
//        return height;

   
//   
//    @Override
//    public String toString() {
//        return width + "x" + height ;
//    }
//
//String widthS = String.valueOf(width);
//    }


    
    
    



    
    
  
   
    
    

