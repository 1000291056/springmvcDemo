package java_api;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2016/10/10.
 */
public class IOTest {
    public static void main(String []ags){
        try {
            RandomAccessFile randomAccessFile=new RandomAccessFile("","rw");

//            randomAccessFile.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
