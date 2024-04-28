package az.garage.due_april29.task1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Book {
    public String name;
    public String author;
    public int yearPublished;

    public Book(String name, String author, int yearPublished) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String toString() {
        return "Book[name=%s, author=%s, year=%d]".formatted(this.name, this.author, this.yearPublished);
    }
}

final class BookManager {

    private static Book[] books;
    private static int size;

    private static final Scanner scanner = new Scanner(System.in);
    private static final String BOOK_NOT_FOUND_EXCEPTION_MESSAGE = "The book name you're looking for is not available!";

    public BookManager(int initialCapacity){
        books = new Book[initialCapacity];
        size = 0;
    }

    public static void showMenu() {
        System.out.println(
                """
                Welcome to Book Manager app!
                We can Add, Update, Delete and Get the books.
                We have many options:
                1. Add the Book
                2. Get the Book
                3. Get all the Books
                4. Update the Book with its name
                5. Delete the Book with its name
                If you're ready, let's choose any option: 
                """
        );
        switch (scanner.nextInt()) {
            case 1 -> {
                getDetailsAndCallAddFunc();
            }
            case 2 -> {
                getTheBookNameAndCallGetByNameFunc();
            }
            case 3 -> {
                callAndHandleGetAllFunc();
            }
            case 4 -> {
                callAndHandleUpdateFunc();
            }
            case 5 -> {
                callAndHandleDeleteFunc();
            }
            default -> {
                System.out.println("Entered operation is not valid!");
            }
        }
    }

    private static void getDetailsAndCallAddFunc() {
        System.out.print("Enter a name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Enter a author: ");
        String author = scanner.nextLine();
        System.out.print("Enter a year: ");
        int yearPublished = scanner.nextInt();
        add(new Book(name, author, yearPublished));
    }

    private static void getTheBookNameAndCallGetByNameFunc() {
        System.out.print("Enter a name: ");
        scanner.nextLine();
        Book book = getByName(scanner.nextLine());
        if (Objects.isNull(book)) {
            System.out.println(BOOK_NOT_FOUND_EXCEPTION_MESSAGE);
        } else {
            System.out.printf("Here you are: %s%n", book);
        }
    }

    private static void callAndHandleGetAllFunc() {
        if (size == 0) {
            System.out.println("We don't have any book currently..");
        } else {
            System.out.println(Arrays.toString(getAll()));
        }
    }

    private static void callAndHandleUpdateFunc() {
        System.out.print("Enter Book name that you wanna update with the new one: ");
        scanner.nextLine();
        String oldBookName = scanner.nextLine();
        System.out.print("Enter a name for a new Book: ");
        String name = scanner.nextLine();
        System.out.print("Enter a author for a new Book: ");
        String author = scanner.nextLine();
        System.out.print("Enter a year for a new Book: ");
        int yearPublished = scanner.nextInt();
        update(oldBookName, new Book(name, author, yearPublished));
    }

    private static void callAndHandleDeleteFunc() {
        System.out.println("Enter the Book name that you wanna delete: ");
        scanner.nextLine();
        delete(scanner.nextLine());
    }

    private static void resizeIfNeeded() {
        if (books.length == size) {
            Book[] newBooks = new Book[books.length * 2];
            System.arraycopy(books, 0, newBooks, 0, size);
            books = newBooks;
        }
    }

    public static void add(Book book) {
        resizeIfNeeded();
        books[size++] = book;
    }

    /**
     * Retrieves a book by its name.
     * <p>
     * This method searches through the array of books and returns the first book
     * that matches the given name. The search is case-insensitive, meaning that it does not
     * consider case when comparing the book names. If no book is found with the specified name,
     * this method returns {@code null}.
     * </p>
     * @param name the name of the book to find. This parameter should not be {@code null}.
     * @return the {@code Book} object with the specified name if found; {@code null} otherwise.
     */
    public static Book getByName(String name) {
        for (int i = 0; i < size; i++) {
            if (books[i].name.equalsIgnoreCase(name))
                return books[i];
        }
        return null;
    }

    public static Book[] getAll() {
        Book[] copiedBooks = new Book[size];
        System.arraycopy(books, 0, copiedBooks, 0, size);
        return copiedBooks;
    }

    public static void update(String oldName, Book newBook) {
        int i = 0;
        for (; i < size; i++) {
            if (books[i].name.equalsIgnoreCase(oldName)) {
                books[i] = newBook;
                break;
            }
        }
        if (i == size) System.out.println(BOOK_NOT_FOUND_EXCEPTION_MESSAGE);
    }

    public static void delete(String name) {
        int temp = size;
        for (int i = 0; i < size; i++) {
            if (books[i].name.equalsIgnoreCase(name)) {
                System.arraycopy(books, i + 1, books, i, size - i - 1);
                size--;
            }
        }
        if (temp == size)
            System.out.println(BOOK_NOT_FOUND_EXCEPTION_MESSAGE);
    }
}

class StartupApplication {

    public static void main(String[] args) {
        callShowMenu();
    }

    private static void callShowMenu() {
        new BookManager(10);
        int i = 0;
        while (true) {
            if(i == 0) {
                BookManager.showMenu();
                i++;
            } else {
                System.out.print("Do you wanna continue? ");
                if (new Scanner(System.in).next().equalsIgnoreCase("yes"))
                    BookManager.showMenu();
                else System.exit(0);
            }
        }
    }
}