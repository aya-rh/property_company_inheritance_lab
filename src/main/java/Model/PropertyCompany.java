package Model;

import Interface.ICommunal;
import Interface.IStudent;
import Model.Building;

import java.util.ArrayList;
import java.util.List;

public class PropertyCompany {

    protected ArrayList<Building> buildings;
    protected String listing;
    protected List<IStudent> students;
    protected List<ICommunal> communals;


    public PropertyCompany(String name){
        this.buildings = new ArrayList<>();
        this.students = new ArrayList<>();
        this.communals = new ArrayList<>();
    }

    public int countBuildings(){
        return this.buildings.size();
    }

    public void addBuildings(Building buildings){
        this.buildings.add(buildings);
    }

    public void removeBuildings(Building buildings){
        this.buildings.remove(buildings);
    }
}
