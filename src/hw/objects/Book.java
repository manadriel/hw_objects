package hw.objects;

import java.util.Objects;

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
    //public String toString() {
     //   return this.name + " " + this.author + " " + this.publishYear;
    //}


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", publishYear=" + publishYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publishYear);
    }
}
