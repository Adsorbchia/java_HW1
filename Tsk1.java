package org.example.hw1;

import java.util.Arrays;
import java.util.Scanner;

public class Tsk1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace("  "," ");
        str = reverseString(str);
        System.out.println(str);



            }
    public static String reverseString(String str){
        String[]words = str.split(" ");
        String result = " ";
        for (int i = words.length-1; i >=0 ; i--) {
            result = result+ words[i] + " ";
        } return result;
    }


        }




