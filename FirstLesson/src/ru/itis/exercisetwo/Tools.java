package ru.itis.exercisetwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tools {
    public String[] encodingToString() {
        String filename = "sortArr.txt";
        File file = new File(filename);
        Scanner sc = new Scanner(System.in);
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String st = "";
        String tmp[] = null;
        String temp;

        String arr[] = new String[15];

        while (sc.hasNextLine()) {
            st = sc.nextLine();
            tmp = st.split("','");
            for(int i = 0; i < arr.length; i++) {

                if(tmp[i].equals("")){
                    tmp[i] = "/n";
                }

                if(i == 0) {
                    tmp[i] = tmp[i].substring(1,tmp[i].length());
                }

                if(i == arr.length - 1) {
                    tmp[i] = tmp[i].substring(0,tmp[i].length()-1);
                }

                arr[i] = tmp[i];
            }
        }

        return arr;
    }

    public int searchEntry(String[] arr) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        int in = -1;

        for (int i = 0; i < arr.length; i++) {
            if(temp.equals(arr[i])){
                in = i;
            }
        }
        if(in == -1) {
            System.out.println("no occurrence");
        }
        return in;
    }
}
