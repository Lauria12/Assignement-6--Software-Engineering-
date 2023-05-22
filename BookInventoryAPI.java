public interface BookInventoryAPI {

    void addBook(Book book, int quantity);
    void updateBookQuantity(Book book, int newQuantity);
    int getBookQuantity(Book book);


}
