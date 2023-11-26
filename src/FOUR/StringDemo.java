package FOUR;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String str = in.next();
        int len = str.length();
        System.out.print("输入开始的位置：");
        int begin = in.nextInt();
        System.out.print("输入终止的位置：");
        int end = in.nextInt();
        if (begin >= 0 && begin <= len && end >= 0 && end <= len && begin < end) {
            str.substring(begin, end);
            System.out.println(str.substring(begin, end));
            System.out.println(str.substring(begin));
        }
        int d = 10;
    }
}
