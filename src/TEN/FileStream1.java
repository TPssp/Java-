package TEN;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream1 {
    public static void main(String[] args){
        try{
            FileOutputStream out=new FileOutputStream("TXT.txt");
            out.write('a');
            out.write('c');

            out.write('c');
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
