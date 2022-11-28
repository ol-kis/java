import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("task2.txt")) {
            Scanner scan = new Scanner(reader);
            int i = 1;

            while (scan.hasNextLine()) {
                var s = scan.nextLine();
                // System.out.println(i + " : " + scan.nextLine());
                System.out.println(s.charAt(2));
                i++;
            }

            reader.close();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

}