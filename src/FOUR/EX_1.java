package FOUR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EX_1 {
    public static void main(String[] args){
        List it=new ArrayList();
        for(int i=0;i<10;i++){
            it.add((int)(1+100*Math.random()));
        }
        System.out.println(it);
        Collections.sort(it);
        System.out.println(it);
    }

}
