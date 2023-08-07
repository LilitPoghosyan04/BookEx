package org.example.bookex;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAOIMPL {
    private final String CREATE = "insert into Books(title,author,publication_year,available_copies) values (?,?,?,?);";

    private final String READ = "select * from Books;";
    private final String UPDATE = "update Books set available_copies=? where id=?";
    private final String DELETE = "delete from Books where id=? ;";


    public void addBook(Book book) {
        try (PreparedStatement create = ConnectionUtil.getConnection().prepareStatement(CREATE);) {
            create.setString(1, book.getTitle());
            create.setString(2, book.getAuthor());
            create.setInt(3, book.getPublicationYear());
            create.setInt(4, book.getAvailableCopies());
            create.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void updateBooks(int AvailableCopies , Integer id) {

        try (PreparedStatement update = ConnectionUtil.getConnection().prepareStatement(UPDATE)) {
            update.setInt(1, AvailableCopies);
            update.setInt(2, id);
            update.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void deleteBooks(Integer id) {
        try (PreparedStatement delete = ConnectionUtil.getConnection().prepareStatement(DELETE);) {
            delete.setInt(1, id);
            delete.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public String readBooks() {
        StringBuilder str = new StringBuilder();
        try (PreparedStatement read = ConnectionUtil.getConnection().prepareStatement(READ)) {
            ResultSet rs = read.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) str.append(",  ");
                    str.append(rs.getString(i));
                    str.append(" ");
                }
                str.append("\n");
            }
            return str.toString();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
//    @Override
//    public String toString(){
//        try (PreparedStatement read = ConnectionUtil.getConnection().prepareStatement(READ)) {
//            ResultSet rs = read.executeQuery();
//        return  "id = " + rs.getInt(1) + ", title = " +
//                getTitle() +", author = " + ", publicationYear = " +
//                getPublicationYear() + ",  availableCopies = " +getAvailableCopies();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
