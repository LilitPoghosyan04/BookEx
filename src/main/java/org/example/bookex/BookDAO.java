package org.example.bookex;


public interface BookDAO {
    void addBook(Book book) ;
    Integer updateBooks(Book book) ;
    void deleteBooks(Book book);
    String readBooks(Book book) ;
}
