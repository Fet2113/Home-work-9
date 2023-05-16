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
}


