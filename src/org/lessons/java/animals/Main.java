package org.lessons.java.animals;

public class Main {

    public static void main(String[] args){

        Animale cane = new Cane();
        Animale passerotto = new Passerotto();
        Animale aquila = new Aquila();
        Animale delfino = new Delfino();


        cane.dormi();
        passerotto.dormi();
        aquila.dormi();
        delfino.dormi();
        cane.mangia();
        passerotto.mangia();
        aquila.mangia();
        delfino.mangia();
        cane.verso();
        passerotto.verso();
        aquila.verso();
        delfino.verso();
    }
}
