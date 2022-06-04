public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Астрид","Линдгрен");
        Author author2 = new Author("Эрнест","Шепард");

        Book book1 = new Book("Малыш и Карлосон", author1, 1955);
        Book book2 = new Book("Винни-Пух",author2,1926);

        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

        System.out.println(author1.equals(author2));
        System.out.println(author2.equals(author1));

        System.out.println(author1);
        System.out.println(author2);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book1));

        System.out.println(book1);
        System.out.println(book2);

    }
}