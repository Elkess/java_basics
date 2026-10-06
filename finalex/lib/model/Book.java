package lib.model;

public class Book {

    // Private :
    private final String title;
    private String author;
    private int year;
    
    private static int count = 0;

    // package-private: 
    public Book(String title, String author, int year) {
        this.title = title;
        setAuthor(author);
        setYear(year);
        count++;
    }
    public Book(String title, String author) {
        this(title, author, 2026);
    }

    // Public :
    public String getTitle() { return title;}
    public String getAuthor() { return author;}
    public int getYear() { return year;}
    
    public static int getCount() {return count;}

    // public void setTitle(String title) { this.title = title;}
    public void setAuthor(String author) { this.author = author;}
    public void setYear(int year) { 
        if (year <= 0) {
            System.err.println("Year must be greater than 0!");
            return;
        }
        this.year = year;
    }
    

    public void describe() {
       System.out.println(this);
    }

    @Override
    public String toString() {
        String res =    "Title: "  +  title + "\n"
                    +   "Author: " +  author + "\n" 
                    +   "Year: "   +  year;
        return (res);
    }

}