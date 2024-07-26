package org.example.books;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        // Using overloaded constructors
        books.add(new Book("The Great Gatsby", 218, 1925));
        books.add(new Book("1984", 328));
        books.add(new Book());

        System.out.println("Books Menu");
        System.out.println("Entering nothing as the title will stop the loop");

        while (true) {
            System.out.print("Enter book title: ");
            String title = sc.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.print("Enter number of pages: ");
            int pages = Integer.parseInt(sc.nextLine());

            System.out.print("Enter the publication year: ");
            int publicationYear = Integer.parseInt(sc.nextLine());
            books.add(new Book(title, pages, publicationYear));
        }

        System.out.println("What Information do you want to print? Choose everything or name ");
        String choice = sc.nextLine().toLowerCase();

        if (choice.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);

            }
        } else if (choice.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

        sc.close();
    }
}
