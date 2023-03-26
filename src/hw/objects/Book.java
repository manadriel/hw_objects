package hw.objects;

public class Book {
    private String name;
    private AuthorName author;
    private int publishYear;
    public Book(String name, AuthorName author, int publishYear) {
        this.name = name;
        this.author = getAuthor();
        this.publishYear = publishYear;
    }
    public String getName() {
        return this.name;
    }
    public AuthorName getAuthor() {
        return this.author;
    }
    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;

    }
}
