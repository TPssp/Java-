package THREE;

import java.util.Scanner;

public class DemoIF {
    public static void main(String[] args){
//        int m,n;
//        System.out.println("Input integer m: ");
//        Scanner in=new Scanner(System.in);
//        m=in.nextInt();
//        System.out.println("Input integer n: ");
//        n=in.nextInt();
//        if(m==n){
//            System.out.println("1");
//        }
//        in.close();
        int m,n;
        System.out.print("input m and n: ");
        Scanner in=new Scanner(System.in);
        m=in.nextInt();
        n=in.nextInt();
        if(m>n){
            System.out.println("m>n");
        }
        else{
            System.out.println("m<=n");
        }
    }
}
