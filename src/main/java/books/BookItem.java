package books;

import com.example.demo.books.Book;

public class BookItem {

    private Book book;
    private int quantity;
    
    public BookItem(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public Book getBook() {
       return this.book;
    }

    public double getTotalPrice() {
        // TODO Auto-generated method stub
        return book.getPrice() * this.quantity;
    }


}
