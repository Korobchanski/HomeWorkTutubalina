package ru.itis.exerciseone;


public class Aeroflot {

    private String dotA;
    private String dotB;
    private String flightNumber;
    private String typeOfAircraft;

    public Aeroflot(String dotA, String dotB, String numberRace, String typeOfAircraft) {
        this.dotA = dotA;
        this.dotB = dotB;
        this.flightNumber = numberRace;
        this.typeOfAircraft = typeOfAircraft;
    }

    public Aeroflot() {
        dotA = null;
        dotB = null;
        flightNumber = null;
        typeOfAircraft = null;
    }

    public void getInfo() {
        System.out.println(dotA + " " + dotB + " " + flightNumber + " " + typeOfAircraft);
    }

    public String getDotA() {
        return dotA;
    }

    public String getDotB() {
        return dotB;
    }

    public String getNumberAndType() {
        return flightNumber + " " + typeOfAircraft;
    }


}