package THREE;

import java.util.Scanner;
public class DemoSWITCH {
    public static void main(String[] args) {
        int a=0;
        while (a!= -1) {
            System.out.print("输入月份：");
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            switch (a) {
                case 1:
                    System.out.println(a + " 月份有31天");
                    break;
                case 2:
                    System.out.println(a + " 月份有28天");
                    break;
                default:
                    System.out.println("I don't know.");
            }
        }
    }
}
