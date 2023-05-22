import java.util.HashMap;
import java.util.Map;

    public class BookInventory implements BookInventoryAPI {
        private Map<Book, Integer> bookCatalogue;

        public BookInventory() {

            bookCatalogue = new HashMap<>();
        }

        public void addBook(Book book, int quantity) {
            bookCatalogue.put(book, quantity);
        }

        public void updateBookQuantity(Book book, int newQuantity) {
            if (bookCatalogue.containsKey(book)) {
                bookCatalogue.put(book, newQuantity);
            } else {
                System.out.println("Book not found in inventory.");
            }
        }

        public int getBookQuantity(Book book) {
            return bookCatalogue.getOrDefault(book, 0);
        }

    }

