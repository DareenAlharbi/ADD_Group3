/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Group {

    private String nameg;
    private List<Pilgrim> pilgrims;
    private static ArrayList<Group> groups = new ArrayList<>();

    public Group(String name) {
        this.nameg = name;
        this.pilgrims = new ArrayList<>();
    }

    public Group() {

    }

    public String getName() {
        return nameg;
    }

    public List<Pilgrim> getPilgrims() {
        return pilgrims;
    }

    public void addPilgrim(Pilgrim pilgrim) {
        pilgrims.add(pilgrim);

    }

    public void removePilgrim1(Pilgrim pilgrim) {
        pilgrims.remove(pilgrim);
    }

    public void removePilgrim(Pilgrim pilgrim) {/////org
        pilgrims.remove(pilgrim);
        System.out.println(pilgrims.get(0).getName() + " has been removed from the group.");
    }

    public int getPilgrimCount() {
        return pilgrims.size() - 1;
    }

}
