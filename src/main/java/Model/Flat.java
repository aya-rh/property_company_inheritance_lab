package Model;

import Model.Building;

public abstract class Flat extends Building {

    private boolean hasRecyclingRoom;

    public Flat(String location, int numberOfRooms, boolean hasRecyclingRoom){
        super(location, numberOfRooms);
    }

    public String bestFacility(){
        return "Gym";
    }

    public int parkingSpaces(){
        return 10;
    }
}
