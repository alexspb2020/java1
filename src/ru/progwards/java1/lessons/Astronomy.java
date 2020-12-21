package ru.progwards.java1.lessons;

public class Astronomy {
    static final Double PI = 3.14;
    static final Double EARTH = 6371.2;
    static final Double MERCURY = 2439.7;
    static final Double JUPITER = 71492.0;

    public static Double sphereSquare(Double r) {
        return 4.0 * PI * Math.pow(r, 2.0);
//        return 4.0 * PI * r*r;
    }

    public static Double earthSquare() {
        return sphereSquare(EARTH);
    }

    public static Double mercurySquare() {
        return sphereSquare(MERCURY);
    }

    public static Double jupiterSquare() {
        return sphereSquare(JUPITER);
    }

    public static Double earthVsMercury() {
        return sphereSquare(EARTH / MERCURY);
    }

    public static Double earthVsJupiter() {
        return sphereSquare(EARTH / JUPITER);
    }

    public static void main(String[] args) {
        System.out.println("earthSquare()= " + earthSquare());
        System.out.println("mercurySquare()= " + mercurySquare());
        System.out.println("JupiterSquare()= " + jupiterSquare());
        System.out.println("earthVsMercury = " + earthVsMercury());
        System.out.println("earthVsJupiter = " + earthVsJupiter());
    }
}