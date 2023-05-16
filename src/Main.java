public class Main {
    public static void main(String[] args) {
        Author person1 = new Author("Вася", "Хренов");
        Author person2 = new Author("Имя2", "Фамилия2");
        Book book1 = new Book("Библия", person1, 2000);
        Book book2 = new Book("Библия", person2, 2001);

        book1.increaseYear(23);
                if (book1.isIneresant()) {
            System.out.println("Скукота");
        } else {
            System.out.println("Наверно крутышка, нужно почитать");
        }
        System.out.println("book1.name = " + book1.getName());
        System.out.println("book1.author = " + book1.getAuthor());
        System.out.println("book1.year = " + book1.getYear());
        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

    }
}