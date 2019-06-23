package learning.dps.behavioral.hdfs.decorator.javabase.io.test;

import learning.dps.behavioral.hdfs.decorator.javabase.io.UpperToLowerInputStream;

import java.io.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        int c;
        try (InputStream in = new UpperToLowerInputStream(new BufferedInputStream(new FileInputStream("src\\learning\\dps\\behavioral\\hdfs\\decorator\\javabase\\io\\test/test.txt")))) {
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        }
    }
}
