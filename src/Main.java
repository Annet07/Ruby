import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());

        String str = "1";

        System.out.println(str);

        for (int i = 0; i < n; i++) {

            NString str1 = new NString(str);

            str = str1.returnNewString();

            System.out.println(str);

        }
    }
}
