package Suskkoo;

import java.io.*;

class BufferedReaderDemo {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = br.readLine();

        System.out.print("Enter your age: ");
        byte age = Byte.parseByte(br.readLine());

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
