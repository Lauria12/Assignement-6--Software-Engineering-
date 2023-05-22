import java.util.Date;

public class Order {
    private String bookIdentifier;
    private int quantity;
    private Date date; 

    public Order(String bookIdentifier, int quantity, Date date) {
        this.bookIdentifier = bookIdentifier;
        this.quantity = quantity;
        this.date = date;
    }

    public void setBookIdentifier(String bookIdentifier) {
        this.bookIdentifier = bookIdentifier;
    }

    public String getBookIdentifier() {
        return bookIdentifier;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setOrderDate (Date date) {
        this.date = date;
    }

    public Date getOrderDate() {
        return date;
    }
}

