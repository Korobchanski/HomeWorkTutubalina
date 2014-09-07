package ru.itis.exerciseone;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.Collator;
import java.util.*;


public class Tools {
    public LinkedList<Aeroflot> encodingToList() {
        String filename = "123.txt";
        File file = new File(filename);
        Scanner sc = new Scanner(System.in);
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String st = "";
        String tmp[] = null;

        LinkedList<Aeroflot> timetable = new LinkedList<Aeroflot>();

        while (sc.hasNextLine()) {
            st = sc.nextLine();
            tmp = st.split(" ");
            String dotA = tmp[0];
            String dotB = tmp[1];
            String flightNumber = tmp[2];
            String typeOfAircraft = tmp[3];
            Aeroflot oneElement = new Aeroflot(dotA, dotB, flightNumber, typeOfAircraft);
            timetable.add(oneElement);

        }
        return timetable;
    }

    public String[] encodingToArr() {
        String filename = "123.txt";
        File file = new File(filename);
        Scanner sc = new Scanner(System.in);
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String st = "";
        String tmp[] = null;

        String arr[] = new String[10];
        int i = 0;
        while (sc.hasNextLine()) {
            st = sc.nextLine();
            arr[i] = st;
            i++;
        }
        return arr;
    }

    public void output(LinkedList<Aeroflot> timetable) {

        ListIterator<Aeroflot> itr = timetable.listIterator();
        while (itr.hasNext()) {
            Aeroflot obj = itr.next();
            obj.getInfo();
        }
    }

    public void checkDotB(LinkedList<Aeroflot> timetable) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        String temptemp = "testtest";
        ListIterator<Aeroflot> itr = timetable.listIterator();
        while (itr.hasNext()) {
            Aeroflot obj = itr.next();
            if (temp.equals(obj.getDotB())) {
                System.out.println(obj.getNumberAndType());
                temptemp = "test";
            }
        }

        if(temptemp.equals("testtest")) {
            System.out.println("There is not point dotB");
        }
    }

    public void outputPopDotA(LinkedList<Aeroflot> timetable) {

        String popDotA = null;
        int maxCount = 1;
        int count;
        int j = 0;

        ListIterator<Aeroflot> itr = timetable.listIterator();


        Collections.sort(timetable, new Comparator<Aeroflot>() {
            @Override
            public int compare(Aeroflot o1, Aeroflot o2) {
                return Collator.getInstance().compare(o1.getDotA(), o2.getDotA());
            }
        });

        while (itr.hasNext()) {
            count = 0;
            Aeroflot obj = itr.next();
            for (int i = j; i < timetable.size(); i++) {
                Aeroflot objNext = timetable.get(i);

                if (obj.getDotA().equals(objNext.getDotA())) {
                    count++;
                }

                if (maxCount < count) {
                    maxCount = count;
                    popDotA = obj.getDotA();
                }
            }
            j++;
        }

        System.out.println(popDotA);

    }
}
