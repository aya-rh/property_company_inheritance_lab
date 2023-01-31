package Model;

import Interface.ICommunal;

public class Communal extends Flat implements ICommunal {

    public Communal(String location, int numberOfRooms, boolean hasRecyclingRoom){
        super (location, numberOfRooms, hasRecyclingRoom);
    }

//    @Override
//    public String getLocation(){
//        return this.location;
//    }
    // don't need this

    public String printLocation(){
        return "This communal flat is located in " + getLocation() + ".";
    }

    @Override
    public String communalListing(int price) {
        return this.location + "Communal Flat - 2 Bedrooms at " + price + ".";
    }
}
