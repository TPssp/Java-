package FIVE;

public class StackStorage implements Storage{
    private int point=0;
    int objectnum=0;
    public void put(Object o){
        storage[point++]=o;
        objectnum++;
    }
    public Object get(){
        objectnum--;
        return storage[--point];
    }
}
