package  com.aus;
import java.util.Scanner;

public class StringReverseRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String rstr = revRecursion(str);
        System.out.println(rstr);
    }

    private static String revRecursion(String str) {
        String reverse ="";
        if (str.length() ==1){
            return str;
        }else {
            reverse += str.charAt(str.length()-1) + revRecursion(str.substring(0,str.length()-1));
            return reverse;
        }
    }
}
