import java.util.ArrayList;

public class PropertyCompany {

    private ArrayList<Building> buildings;

    public PropertyCompany(){
        this.buildings = new ArrayList<>();
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
