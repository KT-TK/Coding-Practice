import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum = A.length() + B.length();
        System.out.println(sum);
        int a = A.compareTo(B);
        if(a>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String A1 = A.substring(0,1).toUpperCase() + A.substring(1);
        String B1 = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(A1 + " " + B1);
        }
        
    }




