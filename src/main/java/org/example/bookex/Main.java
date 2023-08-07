package org.example.bookex;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Book book = new Book(1, "Iliakan", "Homeros", 1525, 120);
        Book book1 = new Book(2, "Faust", "yote", 1624, 45);
        BookDAOIMPL bookDAO = new BookDAOIMPL();
//             bookDAO.addBook(book);
//        bookDAO.addBook(book1);
        bookDAO.deleteBooks(34);
        bookDAO.deleteBooks(33);
        bookDAO.updateBooks(12,41);
        System.out.println(bookDAO.readBooks());
    }
}
