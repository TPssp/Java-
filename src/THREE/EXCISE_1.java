package THREE;
import java.util.Scanner;
public class EXCISE_1 {
    public static void main(String[] args){
        int i=1;
        while(i!=0){
            boolean b=true;
            System.out.print("输入：");
            Scanner scanner=new Scanner(System.in);
            i=scanner.nextInt();
            if(i==1){
                System.out.println(i+"是素数");
            }

            for(int k=2;k<=Math.sqrt(i);k++){
                if(i%k==0){
                    b=false;
                }
            }

            if(b==false){
                System.out.println(i+"不是素数");
            }else if(i>1){
                System.out.println(i+"是素数");
            }
        }
    }
}
