package library;

import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("📚 Welcome to the Library Management System");
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Book Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();

        // Create book object
        Book book = new Book(id, name, author);

        // Save book to database
        LibraryDB.addBook(book);

        scanner.close();
    }
}