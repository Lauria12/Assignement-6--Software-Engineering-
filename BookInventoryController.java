import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookInventoryController {
    
    private BookInventoryAPI bookInventory;

    public BookInventoryController(BookInventoryAPI bookInventory) {
        this.bookInventory = bookInventory;
    }

    @PostMapping
    public void addBook(@RequestBody Book book, @RequestParam(value = "quantity") int quantity) {
        bookInventory.addBook(book, quantity);
    }

    @PutMapping("/{identifier}")
    public void updateBookQuantity(@PathVariable String identifier, @RequestParam(value = "quantity") int quantity) {
        Book book = bookInventory.getBookByIdentifier(identifier);
        if (book != null) {
            bookInventory.updateBookQuantity(book, quantity);
        } else {
            throw new BookNotFoundException("Book not found.");
        }
    }

    @GetMapping("/{identifier}/quantity")
    public int getBookQuantity(@PathVariable String identifier) {
        Book book = bookInventory.getBookByIdentifier(identifier);
        if (book != null) {
            return bookInventory.getBookQuantity(book);
        } else {
            throw new BookNotFoundException("Book not found.");
        }
    }

}
