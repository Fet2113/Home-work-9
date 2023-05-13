public class Author {
    String firstName;
    String SurnameName;

    public Author(String name, String surname) {
        this.firstName = name;
        this.SurnameName = surname;
    }

    public String getName() {
        return this.firstName;
    }

    public String getSurname() {

        return this.SurnameName;
    }
}
