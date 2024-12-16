package org.example;
import java.util.ArrayList;

public class Library {

    private final ArrayList<Book> books;
    public Library(){
        books=new ArrayList<>();

    }
    public void addBook(Book book){
        books.add(book);
    }

public boolean removeBook(String title){
        return books.removeIf(book -> book.title().equals(title));
}
public String listBooks() {
    if (books.isEmpty()) {
        System.out.println("no books available");
    } else {
        for (Book book : books) {
            System.out.println(book.title());
        }
    }
    return("All the remaining books in the library has been listed");
}









}
