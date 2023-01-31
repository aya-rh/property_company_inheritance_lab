package Model;

import Interface.IBungalow;
import Model.Building;

public class Bungalow extends Building implements IBungalow{

    private boolean hasCentralHeating;


    public Bungalow(String location, int numberOfRooms, boolean hasCentralHeating){
        super (location, numberOfRooms);
        this.hasCentralHeating = hasCentralHeating;
    }

    @Override
    public String getLocation(){
        return this.location;
    }


    //method overloading
    public String testingInformation(){
        return "No testing is guaranteed";
    }
    public String testingInformation(String information){
        return "Testing complete for " + information + ".";
    }


    @Override
    public String bungalowListing(int price) {
        return this.location + "Bungalow - 3 Bedrooms at " + price + ".";
    }
}
