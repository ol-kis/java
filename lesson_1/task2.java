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
                String[] arr = s.split(" ");
                int[] myArray = new int[2];
                myArray[i-1]=Integer.parseInt(arr[1]);
                i++;
            }
            reader.close();
            var result = Math.pow(myArray[0],myArray[1]);
            System.out.println(result);

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

}
