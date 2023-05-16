import java.util.Objects;

public class Author {
    private String firstName;
    private String SurnameName;

    public Author(String name, String surname) {
        this.firstName = name;
        this.SurnameName = surname;
    }

    public String toString() {
        return this.firstName + " " + this.SurnameName;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(SurnameName, author.SurnameName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, SurnameName);
    }
}


