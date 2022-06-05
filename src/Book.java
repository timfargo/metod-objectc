import java.util.Objects;

public class Book {

    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Книга \"" + title + "\", год издания: " + year + ",автор: " + author.toString();
    }

    @Override
    public int hashCode(){
        return Objects.hash(title,year,author);
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(title,book.getTitle())&&
                Objects.equals(year,book.getYear())&&
                Objects.equals(author,book.getAuthor());
    }

}


