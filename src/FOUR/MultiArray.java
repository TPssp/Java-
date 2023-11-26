package FOUR;

public class MultiArray {
    public static void main(String[] args){
        int intArray2[][]=new int[3][];
        intArray2[0]=new int[3];
        intArray2[1]=new int[4];
        intArray2[2]=new int[5];
        for(int i=0;i<intArray2[0].length;i++){
            intArray2[0][i]=i;
        }
        for(int i=0;i<intArray2[1].length;i++){
            intArray2[1][i]=i;
        }
        for(int i=0;i<intArray2[2].length;i++){
            intArray2[2][i]=i;
        }
        for(int i=0;i<intArray2.length;i++){
            for(int j=0;j<intArray2[i].length;j++){
                System.out.print(intArray2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
