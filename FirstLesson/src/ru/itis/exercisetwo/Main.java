package ru.itis.exercisetwo;


public class Main {

    public static void main(String[] args) {
        Tools tool = new Tools();

        String[] arr = tool.encodingToString();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(tool.searchEntry(arr));
    }

}
