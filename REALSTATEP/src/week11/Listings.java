package week11;


import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Listings implements Listable {
    private HashMap<String, Residential> listings;
    
    public Listings() {
        listings = new HashMap<>();
    }
    
    @Override
    public HashMap<String, Residential> getListings() {
    	//CREAR OTRO GETTER 
        if (listings.size() > 0) {
            System.out.println("\nCurrent Listings for REO:\n");
            int listingNumber = 1;
            for (Residential residential : listings.values()) {
                System.out.println("Listing No: " + listingNumber);
                System.out.println(residential.toString());
                listingNumber++;
            }
            return listings;
        } else {
            System.out.println("\nThere are no listings. Please add a listing.\n");
            return null;
        }
    }
    
    @Override
    public Residential getListing(String address) {
        return listings.get(address);
    }
    
    @Override
    public Set<String> getStreetAddresses() {
        return listings.keySet();
    }
    
    @Override
    public Collection<Residential> getResidences() {
        return listings.values();
    }
    
    @Override
    public int getListingCount() {
        return listings.size();
    }
    
    @Override
    public void addListing(String address, Residential residence) {
        listings.put(address, residence);
    }




}