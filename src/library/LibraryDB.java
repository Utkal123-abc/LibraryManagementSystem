package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LibraryDB {

    public static void addBook(Book book) {
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/library", "root", "root");

            // Insert query
            String query = "INSERT INTO books (id, name, author) VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, book.getId());
            pst.setString(2, book.getName());
            pst.setString(3, book.getAuthor());

            int rows = pst.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Book added successfully!");
            }

            con.close();

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}