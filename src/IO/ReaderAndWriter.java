package IO;

import java.io.*;

//fileeader和filewriter
public class ReaderAndWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("word.txt");
        FileReader fileReader = new FileReader(file);

        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write("xvxcv");
        fileWriter.close();

        char[] chars = new char[50];
        fileReader.read(chars);
        for(char c:chars){
            System.out.print(c);
        }
        fileReader.close();
    }
}
