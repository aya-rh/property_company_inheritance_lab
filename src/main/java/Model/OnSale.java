package Model;

import Interface.ICommunal;
import Interface.IStudent;

public class OnSale implements IStudent, ICommunal{

    protected String name;

    public OnSale(String name) {
        this.name = name;
    }

    @Override
    public String communalListing(int price) {
        return this.name + "2 bedroom communal flat in Hastings " + price + ".";
    }

    @Override
    public String studentListing(int price) {
        return this.name + "Student flat - studio";
    }


//    public void addListing(IBungalow listings){
//        this.listing.add(listings);
//    }
}
