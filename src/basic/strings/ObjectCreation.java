package basic.strings;

public class ObjectCreation {
    public static void main(String[] args) {
        String s1=new String("ABC");//1 SCP ,1 heap
        String s2=s1.toUpperCase();//no new object will be created in heap
        String s3=s1.toLowerCase();//new object will be created in heap
        String s4=s1.concat("CDF");//new object will be created in heap

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);

        //1 object in SCP
        String s11="FGH";
        //i object in Heap,same object has already is there in SCP.
        String s55=new String("FGH");
        String s22=s11.toUpperCase();//no object in SCP.
        String s33=s11.toLowerCase();//1 new object only in SCP.
        String s44=s11.concat("MNO");//1 new object only in SCP.

        System.out.println(s11==s22);
        System.out.println(s11==s33);
        System.out.println(s11==s44);

        System.out.println(s55==s22);
        System.out.println(s55==s33);
        System.out.println(s55==s44);
    }
}
