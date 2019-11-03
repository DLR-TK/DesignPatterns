package com.tk.adapter;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("e:/text.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);//适配器
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();
        while (line != null && ! line.equals("")) {
            System.out.println(line);
        }
        bufferedReader.close();
        inputStreamReader.close();
        fileInputStream.close();
    }
}
