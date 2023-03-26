package hw.objects;

public class AuthorName {
    private String name;
    private String surname;
    public AuthorName(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getname() {

        return this.name;
    }
    public String getSurname() {

        return this.surname;
    }
}
