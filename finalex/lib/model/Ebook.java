package lib.model;

public class Ebook extends Book {
    private int fileSizeMb;

    public Ebook(String title, String author, int year, int fileSizeMb){
        super(title, author, year);
        this.fileSizeMb = fileSizeMb;
    }

    @Override
    public void describe() {
       System.out.println(this);
       System.out.println("File Size Mb: " + fileSizeMb);
    }
}