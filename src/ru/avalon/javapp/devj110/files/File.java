
package ru.avalon.javapp.devj110.files;


public abstract class File {
    private String name;
    private int size;
    private Format format;

    public File(String name, int size, Format format) {
        setName(name);
        setSize(size);
        setFormat(format);
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().equals(""))
            throw new IllegalArgumentException("Имя файла не должно быть пустой ссылкой или пустой строкой");
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if(size <= 0)
            throw new IllegalArgumentException("Размер файла должен быть строго больше нуля");
        this.size = size;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        if(format == null)
            throw new IllegalArgumentException("Формат файла не может быть пустой ссылкой");
        this.format = format;
    }
            
    public void print() {
//        System.out.println(name + "." + format.getFormat() +" " + size + getDetails());        
        System.out.printf("%-20s | %10s | %-30s", name+"."+format.getFormat(), size, getDetails() );
    }
    
    public abstract String getDetails();
    
    public static void printAll(File[] files) {
        for (File file : files) {
            file.print();
            System.out.println();
        }
    }
}

