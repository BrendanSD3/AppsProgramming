package sd4.dobs.bookcatalog.src;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> bookList;
    
    public BookManager() {
        bookList = new BookCatalog().getCatalog();
    }
    
    public List<Book> getBooksByTitle(String title) {
        List<Book> books = new ArrayList<>();
        bookList.stream().filter((b) -> (b.getTitle().equals(title))).forEachOrdered((b) -> {
            books.add(b);
        });
        return books;
    }
    
    public List<Book> getBooksByCategory(String category) {
        List<Book> books = new ArrayList<>();
        bookList.stream().filter((b) -> (b.getCategory().equals(category))).forEachOrdered((b) -> {
            books.add(b);
        });
        return books;
    }
    
    public List<Book> getBooksByFormat(String format) {
        List<Book> books = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getFormat().equals(format)) {
                books.add(b);
            }
        }
        return books;
    }
}