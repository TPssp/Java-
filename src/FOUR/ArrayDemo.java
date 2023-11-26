package FOUR;

public class ArrayDemo {
    /**
     * 生成一个长度为n的数组，数组元
     * @param n 数组长度
     * @return 返回一个长度为n的数组
     */
    public static int[] maxmin(int n){
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=(int)(100+401*Math.random());
        }
        return a;
    }

    public static void main(String[] args){
        int[] a=maxmin(10);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
