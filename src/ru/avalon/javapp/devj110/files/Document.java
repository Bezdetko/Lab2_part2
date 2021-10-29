package ru.avalon.javapp.devj110.files;

public class Document extends File {
    private int numberOfPages;

    public Document(String name, int size, Format format, int numberOfPages) {
        super(name, size, format);
        setNumberOfPages(numberOfPages);
    }
    
    
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages <=0)
            throw new IllegalArgumentException("Количество страниц должно быть строго больше нуля");
        this.numberOfPages = numberOfPages;
    }
    
     @Override
    public String getDetails() {
              
        return getFormat().getFormat() + " " + numberOfPages + " pages";
    }
    
}
