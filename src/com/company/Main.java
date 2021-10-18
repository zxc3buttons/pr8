package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* variant 3 lab 8 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String info = sc.nextLine();

        String address = "C:\\Users\\Олег\\Desktop\\forPractice.txt";

        try(FileWriter rewriter = new FileWriter(address, false)){
            rewriter.write(info);
        }
        catch (Exception ex){
            System.out.println(ex);
        };
    }
}
