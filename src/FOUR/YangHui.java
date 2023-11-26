package FOUR;

public class YangHui {
    public void yangHui(int n){
        int yh[][]=new int[n][];
        int i;
        for(i=0;i<n;i++){
            yh[i]=new int[i+1];
            yh[i][0]=1;
            yh[i][i]=1;
        }
        for(i=2;i<n;i++){
            for(int k=1;k<i;k++){
                yh[i][k]=yh[i-1][k-1]+yh[i-1][k];
            }
        }
        for(i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(yh[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        YangHui yh=new YangHui();
        yh.yangHui(10);
    }
}
