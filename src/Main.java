public class Main {
    public static void main(String[] args) {
        Author person1 = new Author("Имя1", "Фамилия1");
        Author person2 = new Author("Имя2", "Фамилия2");
        Book book1 = new Book("Книга1", person1, 2000);
        Book book2 = new Book("Книга2", person2, 2001);
        book1.setYear(2020);
        System.out.println("book1.name = " + book1.getName());
        System.out.println("book1.author = " + book1.getAuthor().SurnameName + " " + book1.getAuthor().firstName);
        System.out.println("book1.name = " + book1.getYear());
    }
}