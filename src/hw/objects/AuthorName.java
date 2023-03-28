package hw.objects;

import java.util.Objects;

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
    // public String toString() {
      //  return "Имя автора: " + this.name + " " + this.surname;
   // }
    public boolean equals(AuthorName other) {
        if (this.name.equals(other.name) && this.surname.equals(other.surname)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "AuthorName{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorName that = (AuthorName) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
