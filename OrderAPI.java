import java.util.Date;

public interface OrderAPI {
    void setBookIdentifier(String bookIdentifier);
    String getBookIdentifier();
    void setQuantity(int quantity);
    int getQuantity();
    void setOrderDate (Date date);
    Date getOrderDate();
}
