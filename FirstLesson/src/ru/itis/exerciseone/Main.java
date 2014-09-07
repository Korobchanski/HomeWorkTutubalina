package ru.itis.exerciseone;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Tools tool = new Tools();
        LinkedList<Aeroflot> timetable = tool.encodingToList();
        tool.outputPopDotA(timetable);
        tool.checkDotB(timetable);
        //String[] timetableArr = tool.encodingToArr();
        //tool.output(timetable);

    }
}
