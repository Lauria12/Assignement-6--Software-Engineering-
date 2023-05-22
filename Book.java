public class Book {
    private String identifier;
    private String title;
    private String author;
    private int year;

    public Book(String identifier, String title, String author, int year) {
        this.identifier = identifier;
        this.title = title;
        this.author = author;
        this.year = year;
    } 

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }



}