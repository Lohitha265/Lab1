package lab1;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        String str1 = str.toLowerCase();
        String rev = "";
        for(int i = str1.length()-1; i>=0;i--){
            rev = rev + str1.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("yes it is palindrome");
        }else{
            System.out.println("no it is not palindrome");
        }
        sc.close();
    }
}