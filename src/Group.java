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
public class Group {
 
    private String name;
    private List<Pilgrim> pigrims;

    public Group(String name, List<Pilgrim> pigrims) {
        this.name = name;
        this.pigrims = pigrims;
    }

    public String getName() {
        return name;
    }

    public List<Pilgrim> getPigrims() {
        return pigrims;
    }

    
}
