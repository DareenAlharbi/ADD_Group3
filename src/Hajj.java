/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author m.als
 */
 import java.util.ArrayList;
import java.util.List;
public class Hajj {
     


    private List<Group> groups;

    public Hajj() {
        this.groups = new ArrayList<>();
    }

    public void createGroup(String groupName, List<Pilgrim> pigrims) {
        Group group = new Group(groupName, pigrims);
        groups.add(group);
    }

    public List<Group> getGroups() {
        return groups;
    }
}

