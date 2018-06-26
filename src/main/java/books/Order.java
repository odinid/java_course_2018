package books;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<BookItem> bookItem = new ArrayList<>();
    //private BookItem bookItem;
    private int bookAmount;
    private double totalPrice;
    private double discount;
    private double netPrice;

    public int getBookAmount() {
        return this.bookAmount;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public double getDiscount() {
        return this.discount;
    }

    public double getNetPrice() {
        return this.netPrice;
    }

    public void addItem(BookItem bookItem) {
        this.bookItem.add(bookItem);
    }

    public void process() {
        if (!this.bookItem.isEmpty()) {
            this.bookAmount = this.bookItem.size();
            
            for (BookItem book : bookItem)
            {
                // Calculate price
                //this.totalPrice = bookItem.getBook().getPrice();
                this.totalPrice += book.getTotalPrice();
            }
                
            // Calculate discount
            if (getBookAmount() == 2) {
                this.discount = getTotalPrice() * 0.05;
            }

            // Calculate net price
            this.netPrice = this.getTotalPrice() - this.getDiscount();
        }
    }

}
