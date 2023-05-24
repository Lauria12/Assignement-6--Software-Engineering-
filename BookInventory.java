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

        public void deserializeInventoryFromJson(String json) {
            try {
                bookQuantityMap = objectMapper.readValue(json, HashMap.class);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
    }

        public int getBookQuantity(Book book) {
            return bookCatalogue.getOrDefault(book, 0);
        }


        public static void main(String[] args) {
            // Create a BookInventory instance
            BookInventory bookInventory = new BookInventory();

            // Add books to the inventory
            bookInventory.addBook(new Book("1", "Book 1", "Author 1", 2021), 10);
            bookInventory.addBook(new Book("2", "Book 2", "Author 2", 2022), 20);

            // Update the quantity of a book
            bookInventory.updateBookQuantity(new Book("1", "Book 1", "Author 1", 2021), 15);

            // Get the quantity of a book
            System.out.println(bookInventory.getBookQuantity(new Book("1", "Book 1", "Author 1", 2021)));

            // Serialize the inventory to JSON
            String json = bookInventory.serializeInventoryToJson();
            System.out.println(json);

            // Deserialize the JSON back into the inventory
            bookInventory.deserializeInventoryFromJson(json);

        }

    }

