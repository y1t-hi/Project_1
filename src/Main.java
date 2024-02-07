import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose an option:\n" +
                "(1) Add a task.\n" +
                "(2) Remove a task.\n" +
                "(3) Update a task.\n" +
                "(4) List all tasks.\n" +
                "(0) Exit.");
        String userInput = input.nextLine();
        ArrayList<String> tasks = new ArrayList<String>();
        while (!(userInput.equals("0"))) {
            if (userInput.equals("1")) {
                addTask(tasks);

            }
            if (userInput.equals("2")) {
                removeTask(tasks);

            }
            if (userInput.equals("3")) {
                updateTask(tasks);
            }
            if (userInput.equals("4")) {
                System.out.println("Here is a list of all the tasks.");
                System.out.println(tasks);

            }
            System.out.println("Please select a different option:\n" +
                    "(1) Add a task.\n" +
                    "(2) Remove a task.\n" +
                    "(3) Update a task.\n" +
                    "(4) List all tasks.\n" +
                    "(0) Exit.");
            userInput = input.nextLine();

        }

    }

    static ArrayList<String> addTask(ArrayList x) {
        Scanner input = new Scanner(System.in);
        System.out.println("Add a task.");
        x.add(input.nextLine());
        return x;
    }

    static ArrayList<String> removeTask(ArrayList y) {
        Scanner input = new Scanner(System.in);
        System.out.println(y);
        System.out.println("Remove the task.");
        y.remove(input.nextLine());
        return y;
    }

    static ArrayList<String> updateTask(ArrayList z) {
        Scanner input = new Scanner(System.in);
        System.out.println("Update the task.");
        z.add(input.nextLine());
        return z;
    }


}