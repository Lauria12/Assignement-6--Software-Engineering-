import java.util.HashMap;

public class Catalog {
   private HashMap<String, Book> books = new HashMap<>();

   public Catalog() {
    this.books = new HashMap<>();
   }

   public void addBook(Book book) {
    books.put(book.getIdentifier(), book);
   }

   public Book getBook(String identifier) {
    return books.get(identifier);
   }

   public void update(Book book) {
    books.put(book.getIdentifier(), book);
   }

   public void delete(String identifier) {
    books.remove(identifier);
   }
}
