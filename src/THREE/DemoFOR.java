package THREE;

import java.util.Scanner;
public class DemoFOR {
    public static void main(String[] args){
        for(int i=1;i<10;i++){
            for(int j=0;j<10;j++){
                if(j<i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
