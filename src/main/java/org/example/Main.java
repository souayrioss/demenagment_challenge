package org.example;

import static org.example.Lib.*;

public class Main {
    public static void main(String[] args) {
        Carton carton = InstanceCarton();
        carton.addObjet(new Objet("souris"));
        carton.addObjet(new Objet("eeeeee"));
       // carton.addCarton(new Carton("ppppp"));
        Demenagement demenagement = InstanceDemenagement();
        demenagement.addCartonGlobale(carton);
        System.out.println(demenagement);


        printMenu();
    }
}