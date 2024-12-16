/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public  class App {
    public static void main(String[] args) {
        //create a library
        Library library = new Library();
        //add to library
        library.addBook(new Book("original", "kwame arthur", 2024));
//        add patron
        Patron patron = new Patron("alice",208);
// borrow book
        patron.borrowBook(new Book("original", "kwame arthur", 2024),library);
//listborrowed book
        patron.listBorrowedBooks();

        // show book
        System.out.println(library.listBooks());


    }
}
