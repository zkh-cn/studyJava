package IO;

import java.io.*;
//fileoutputstream和fileinputstream用法
public class FileStreamTest {
    public static void main(String[] args) {
        File file = new File("word.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String content = "qwe";
            String content2 = "大河之剑天上来！";
            byte[] bytes = content.getBytes();
            byte[] bytes1 = content2.getBytes();
            fileOutputStream.write(bytes1);
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int read = fileInputStream.read(bytes);
            System.out.println(new String(bytes,0,read));
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
}
