package schoolBook;

public class Student {
    public static void run() {
        System.out.println("What do you want? \nView ratings-enter 1\nView attendance -enter 2\nExit- enter 3\n");
        try {
            int menu = Integer.parseInt(System.console().readLine());
            while (menu != 1 & menu != 2 & menu != 3) {
                System.out.println("You enter wrong number!Try again\n");
                System.out
                        .println("What do you want? \nView ratings-enter 1\nView attendance -enter 2\nExit- enter 3\n");
                menu = Integer.parseInt(System.console().readLine());
            }
            Print.run("student.txt");
            System.out.println("Enter id student: \n");
            int id_student=Integer.parseInt(System.console().readLine());
            

        catch (Exception e) {
            System.out.println("\nYou enter not number. Try again!\n");
        }

    }

}