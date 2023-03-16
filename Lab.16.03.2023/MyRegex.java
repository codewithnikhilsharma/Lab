package Lab;

import java.util.Scanner;

class MyRegex0 {
    static String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                             + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                             + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                             + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}

public class MyRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        while (n-- > 0) {
            String ipAddress = scanner.nextLine();
            boolean isValid = ipAddress.matches(MyRegex0.pattern);
            System.out.println(isValid);
        }
        scanner.close();
    }
}

