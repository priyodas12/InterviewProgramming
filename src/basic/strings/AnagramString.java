package basic.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string");
        String input1 = sc.next();
        System.out.println("Enter 2nd string");
        String input2 = sc.next();
        char[] ar1 = input1.toCharArray();
        char[] ar2 = input2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        int j=0;
        if(ar1.length==ar2.length){
            for(int i=0;i< ar1.length;i++){
                if(ar1[i]==ar2[i]){
                    j+=1;
                }
            }

        }
        else{
            System.out.println("Different length string so!");
        }
        System.out.println(j==ar1.length?"Both are Anagram":"Both are Not Anagram");

    }*/

        int j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input1:");
        String s1 = sc.next();
        System.out.println("enter input2:");
        String s2 = sc.next();
        char[] ar1 = s1.toCharArray();
        char[] ar2 = s2.toCharArray();
        int len1 = ar1.length;
        int len2 = ar2.length;
        if(len1!=len2){
            System.out.println("Different length,not be comparable");
        }
        if(len1==len2){
            HashMap<Character,String> m = new HashMap<>();
            for( char a : ar1 ){
                m.put(a,"present");
            }
            for( char ab : ar2){
                if(m.containsKey(ab)){
                    j++;
                } else {

                    break;
                }
            }
        }
        if( j == len1 ){
            System.out.println("input1: "+s1+"   input2: "+s2+" is anagram");
        }

    }
}
