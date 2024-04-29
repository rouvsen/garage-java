package az.garage.due_april29.task2;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class User {
    public String fullName;
    public int age;
    public String address;
    public String email;
    public String username;
    public String password;
    public final String pin;

    public User(String fullName, int age, String address, String email, String username, String password, String pin) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.email = email;
        this.username = username;
        this.password = password;
        this.pin = pin;
    }

    public String toString() {
        return "User[fullName=%s, age=%d, address=%s, email=%s, username=%s, password=%s, pin=%s]".formatted(
                this.fullName, this.age, this.address, this.email, this.username, this.password, this.pin
        );
    }
}

class UserManager {
    //login, register business logics
    private static User[] users;
    private static int size;
    public UserManager (int initialCapacity) {
        users = new User[initialCapacity];
        size = 0;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void menu() {
        new UserManager(15);
        int i = 0;
        while (true) {
            if (i == 0) {
                showMenu();
                i++;
            } else {
                System.out.print("Do you wanna continue? ");
                if (scanner.next().equalsIgnoreCase("yes")) {
                    showMenu();
                } else {
                    System.exit(0);
                }
            }
        }
    }
    public static void showMenu() {
        System.out.print("""
                Welcome to User Manager App!
                You can sign in and sign up to this System,
                in addition you can manager all the things related it!
                1. Sign in to the System
                2. Sign up to the System
                3. Get User by username
                4. Get all Users
                If you're ready, chose an option: 
                """);
        switch (scanner.nextInt()) {
            case 1 -> {
                signIn();
            }
            case 2 -> {
                signUp();
            }
            case 3 -> {
                getByName();
            }
            case 4 -> {
                getAll();
            }
            default -> {
                System.out.println("Given option isn't valid!");
            }
        }
    }

    private static void signIn() {
        //refactor here
        if (size == 0) {
            System.out.println("There is no any User in the System! please register firstly.");
            return;
        }
        System.out.print("Enter your username: ");
        String username = scanner.next();
        System.out.print("Enter your password: ");
        String password = scanner.next();
        for (User user : users) {
            if (Objects.isNull(user)) break;
            if (user.username.equalsIgnoreCase(username)) {
                if (user.password.equals(password)) {
                    System.out.println("You logged in!");
                    return;
                } else {
                    System.out.println("Invalid password!");
                    return;
                }
            }
        }
        System.out.println("Given username doesn't match any User!");
    }

    private static void signUp() {
        System.out.print("Enter your full name: ");
        scanner.nextLine();
        String fullName = scanner.nextLine();
        //check for email
        System.out.print("Enter your email: ");
        String email = scanner.next();
        if (size != 0) {
            for(User user : users) {
                if (user.email.equals(email)) {
                    System.out.println("Duplicate email! please try other one.");
                    return;
                }
            }
        }
        //check for username
        System.out.print("Enter your username: ");
        String username = scanner.next();
        if (size != 0) {
            for(User user : users) {
                if (user.username.equals(username)) {
                    System.out.println("Duplicate username! please try other one.");
                    return;
                }
            }
        }
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your address: ");
        scanner.nextLine();
        String address = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        System.out.print("Enter your pin: ");
        String pin = scanner.next();
        users[size++] = new User(fullName, age, address, email, username, password, pin);
    }
    private static void getByName() {
        System.out.print("Enter a username for searching by: ");
        String username = scanner.next();
        if (size != 0) {
            for (User user : users) {
                if (user.username.equals(username)) {
                    System.out.println(user);
                    return;
                }
            }
        }
        System.out.printf("This User with given username <%s> not exists in the System!%n", username);
    }

    private static void getAll() {
        if(size != 0)
            System.out.println(Arrays.toString(users));
        else System.out.println("There is no any User in the System!");
    }
}

class StartUpUserManagerApp {
    public static void main(String[] args) {
        UserManager.menu();
    }
}
