package dk.easvae.usermanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {

    private ArrayList<User> users = new ArrayList<>();
    private int userIdCounter = 1;

    public void addUser(String name, String email, int age) {
        User newUser = new User(++userIdCounter, name, email, age);
        users.add(newUser);
        System.out.println("User added: " + newUser);
    }

    public void listUsers() {
        if (users.isEmpty()) {
            System.out.println("No users found");
        } else {
            for (User user : users) {
                System.out.println(user);
            }
        }
    }

    // Delete users
    public void deleteUser (int id) {
        users.removeIf(user -> user.getId() == id);
        System.out.println("User deleted (ID: " + id + ")");
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1 - Add User");
            System.out.println("2 - List Users");
            System.out.println("3 - Delete User");
            System.out.println("4 - Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Email: ");
                    String email = scanner.nextLine();
                    System.out.println("Age: ");
                    int age = scanner.nextInt();
                    addUser(name, email, age);
                    break;
                case 2:
                    listUsers();
                    break;
                case 3:
                    System.out.println("Enter ID of the user you would like to delete: ");
                    int id = scanner.nextInt();
                    deleteUser(id);
                    break;
                case 4:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid choice, try again");
            }
        }
    }

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.menu();
    }
}
