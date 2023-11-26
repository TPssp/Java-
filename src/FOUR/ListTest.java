package FOUR;
import java.util.*;
public class ListTest {
    public static void main(String[] args){
        List it=new LinkedList();
        for(int i=0;i<10;i++){
            it.add(i);
        }
        System.out.println(it);
        it.add(2,10);
        System.out.println(it);
        it.set(5,11);
        System.out.println(it);
        System.out.println((int)it.get(6)+10);
        System.out.println(it.indexOf(10));
        it.remove(10);
        System.out.println(it);
    }
}
