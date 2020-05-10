package basic.strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//using reg-ex
public class MaxOccuringString {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the whole sentence...");
        String wholeInput=scn.nextLine();


        String [] processed=wholeInput.split("\\s+");
        Map<String,Integer> hm=new HashMap<String,Integer>();

        for(String s:processed){
            System.out.println(s);
           if(hm.containsKey(s)){
               hm.put(s,hm.get(s)+1);
           }
           else{
               hm.put(s,1);
           }
        }
        System.out.println(hm);
        Integer i=hm.entrySet().stream().max((o1, o2) -> o1.getValue()-o2.getValue()).get().getValue();
        System.out.println(i);
    }
}
