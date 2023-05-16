import java.time.Year;

public class Book {
    private String nameBook;
    private Author nameAuthor;
    private int yearBorn;


    public Book(String name, Author surname, int year) {
        this.nameBook = name;
        this.nameAuthor = surname;
        this.yearBorn = year;
    }

    public boolean isIneresant() {
        return this.getYear() < 1700;

    }

    public String getName() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.nameAuthor;
    }

    public int getYear() {
        return this.yearBorn;
    }


    public void increaseYear(int increment) {

        if (increment < 0) {
            throw new IllegalArgumentException("Это шляпа какая-то");
        }
        this.yearBorn = yearBorn + increment;
    }
    @Override
    public int hashCode() {

        return java.util.Objects.hash(nameBook);
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book2 = (Book) other;
        return nameBook.equals(book2.nameBook);
    }
}







