package FOUR;

public class DemoString {
    public static void main(String[] args){
        String str1="abcdefg";
        String str2,str3,str4;
        str2=str1.substring(1,3);
        System.out.println(str2);
        str3=str1.toUpperCase();
        System.out.println(str3);
        str4=str1.replace("ab","12");
        System.out.println(str4);
    }
}
