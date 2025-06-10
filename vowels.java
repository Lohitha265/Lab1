package lab1;

import java.util.*;
public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.next();
        String str = s.toLowerCase();
        int count = 0;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.print("Count of the vowels in the string : ");
        System.out.println(count);
        sc.close();
    }
}