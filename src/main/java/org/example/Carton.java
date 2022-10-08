package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Carton {
    private static final AtomicInteger count = new AtomicInteger(0);
    private  int id_Carton;
    private String name;
    private List<Object> cartons ;

    public Carton( String name) {
        this.id_Carton = count.incrementAndGet();;
        this.name = name;
        this.cartons  = new ArrayList<Object>();
    }

    public Carton() {
        this.cartons = new ArrayList<Object>();
    }

    public int getId_Carton() {
        return id_Carton;
    }

    public void setId_Carton(int id_Carton) {
        this.id_Carton = id_Carton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getCartons() {
        return cartons;
    }

    public void setCartons(List<Object> cartons) {
        this.cartons = cartons;
    }

    @Override
    public String toString() {
        return "Carton{" +
                "id_Carton=" + id_Carton +
                ", name='" + name + '\'' +
                ", cartons=" + cartons +
                '}';
    }

    public Carton affCarton(){

        return null;
    }
    public void addObjet(Objet objet){
        this.cartons.add(objet);
    }
    public void addCarton(Carton carton){
        this.cartons.add(carton);
    }

}
