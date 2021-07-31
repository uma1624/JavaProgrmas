import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intnum = scanner.nextInt();
        float floatnum = scanner.nextFloat();
        double dnum = scanner.nextDouble();
        String string = scanner.nextLine();

        System.out.println("intnum = "+intnum + " floatnum ="+floatnum+" double num = "+dnum +" String = "+string);
    }
}
