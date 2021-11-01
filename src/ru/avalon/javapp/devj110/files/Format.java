package ru.avalon.javapp.devj110.files;

public enum Format {
    DOCX("docx"),
    PNG("png"),
    MP3("mp3"),
    AVI("avi"),
    PDF("pdf");

    private final String format;

    private Format(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
 
       
}
