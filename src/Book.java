public class Book {
    private String nameBook;
    private Author nameAuthor;
    private int yearBorn;


    public Book(String name, Author surname, int year) {
        this.nameBook = name;
        this.nameAuthor = surname;
        this.yearBorn = year;
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

    public void setYear(int year) {
        this.yearBorn = year;
    }
}
