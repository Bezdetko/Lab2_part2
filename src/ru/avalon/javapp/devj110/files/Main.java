
package ru.avalon.javapp.devj110.files;

public class Main {
   
    public static void main(String[] args) {
        File[] files = {
            new Document ("j110-lab2-hiers", 23212, Format.DOCX, 2),
            new Image ("spb-map", 1703527, Format.PNG, new Resolution(1024, 3072)),
            new Multimedia("06-PrettyGirl", 7893454, Format.MP3, "audio, Eric Clapton, Pretty Girl", new Time(328)),
            new Video("BackToTheFuture1", 1470984192, Format.AVI, "video, Back to the future I, 1985", new Time(6488), new Resolution(640, 352)),          

        };
                 
System.out.println("-".repeat(90));        
System.out.printf("%-20s | %10s | %-50s %n", "        File name", "  Size  ", "Details" );
System.out.println("-".repeat(90));
        File.printAll(files);
System.out.println("-".repeat(90));        
            

    Document[] docs = {
        new Document ("j110-lab2-hiers", 23212, Format.DOCX, 2),
        new Document ("j110-lab1", 220160, Format.PDF, 2)
                 
        };
    
    System.out.println("-".repeat(90));        
    System.out.printf("%-20s | %10s | %-50s %n", "        File name", "  Size  ", "Details" );
    System.out.println("-".repeat(90));
        File.printAll(docs);
//Создайте массив на базе одного из дочерних типов и заполните его несколькими объектами.
//Распечатайте содержимое массива при помощи имеющегося метода printAll. В комментариях
//к вызову объясните, почему этот метод подходит для массива дочернего типа.
//
//Метод printAll, расположеный в классе File, имеет спецификатор доступа pubic.
//Класс Document наследует класс File, т.е. является дочерним и может обращаться ко всем членам и методам класса File со спецификаторами доступа public и protected.
    System.out.println("-".repeat(90));  
    
    
    
    }
}
     
