package test;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File(Test.class.getClassLoader().getResource("1.txt").getPath());
        BufferedReader bis = new BufferedReader(new FileReader(file));
        String string = bis.readLine();
        System.out.println(string);
    }
}
