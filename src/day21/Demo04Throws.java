package day21;

import java.io.FileNotFoundException;

public class Demo04Throws {
    public static void main(String[] args) throws FileNotFoundException {
      read("asdasd");
    }

    public static void read(String faileName) throws FileNotFoundException {
        if (!faileName.equals("c:\\\\zhou.jie")){
            throw new FileNotFoundException("文件路径不是。。。。");

        }
    }
}
