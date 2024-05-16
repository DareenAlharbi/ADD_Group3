/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class g {
    private String nameg;
    private List<Pilgrim> pilgrims;

    public g(String name) {
        this.nameg = name;
        this.pilgrims = new ArrayList<>();
    }

    public String getName() {
        return nameg;
    }
    

    public  List<Pilgrim> getPilgrims() {
        return pilgrims;
    }

    public void addPilgrim(Pilgrim pilgrim) {
        pilgrims.add(pilgrim);
        
    }

    public void removePilgrim(Pilgrim pilgrim) {
        pilgrims.remove(pilgrim);
        System.out.println(pilgrims.get(0).getName()+ " has been removed from the group.");
    }
    public int getPilgrimCount() {
        return pilgrims.size();
    }
}