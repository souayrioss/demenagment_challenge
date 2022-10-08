package org.example;
import org.example.Demenagement.*;
import java.util.Scanner;

public abstract class Lib {

    public static Demenagement InstanceDemenagement(){
        Demenagement demenagement = new Demenagement();
        return demenagement;
    }
    public static Carton InstanceCarton(){
        Carton carton = new Carton();
        return carton;
    }
    public static void printMenu(){
        System.out.println("creer un carton : 1");
        System.out.println("remplir un carton : 2");
        System.out.println("afficher un carton : 3\n");
        int x;
        do {
            System.out.print("enter voter choix => ");
            Scanner scan = new Scanner(System.in);
            x = scan.nextInt();
        }while (x<1 || x>3);
        switch (x){
            case 1:
                //addCarton();
                break;
            case 2:
                //addCarton();
                break;
            case 3:
                //affCarton();
                break;
        }

    }
}
