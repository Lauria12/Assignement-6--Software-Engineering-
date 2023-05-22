public interface CatalogAPI {
    void addBook(Book book);
    Book getBook(String identifier);
    void update(Book book);
    public void delete(String identifier);
}
