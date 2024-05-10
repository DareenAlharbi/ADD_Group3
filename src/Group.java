/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author m.als
 */
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 96650
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Group {
    private String name;
    private List<Pilgrim> pilgrims;

    public Group(String name) {
        this.name = name;
        this.pilgrims = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Pilgrim> getPilgrims() {
        return pilgrims;
    }

    public void addPilgrim(Pilgrim pilgrim) {
        pilgrims.add(pilgrim);
        System.out.println(pilgrim.getName() + " has been added to the group.");
    }

    public void removePilgrim(Pilgrim pilgrim) {
        pilgrims.remove(pilgrim);
        System.out.println(pilgrim.getName() + " has been removed from the group.");
    }
}