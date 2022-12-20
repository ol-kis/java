package schoolBook;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Objects;

public class Read {
    public static void run(String file_name) {
        Object[] arr = new Object[];
        try (FileReader reader = new FileReader(file_name)) {
            try (Scanner scan = new Scanner(reader)) {
                int i = 1;
                while (scan.hasNextLine()) {
                    var s = scan.nextLine();
                    Object[] arr2 = s.split(" ");
                    arr.add(arr2);
                    System.out.println(arr);
                    i++;
                }

            }
            reader.close();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

}
