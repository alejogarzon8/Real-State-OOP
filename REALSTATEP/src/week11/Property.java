package week11;


public abstract class Property {
    private String streetAddress;
    private String zip;
    private double listPrice=0.0;
    private double appraisalPrice=0.0;

    public Property(String streetAddress, String zip) {
        this.streetAddress = streetAddress;
        this.zip = zip;
    }

    public Property() {
        this.streetAddress = "Property";
        this.zip = "00000";

    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        if (zip != null && zip.matches("^\\d{5}(-\\d{4})?$") && Integer.parseInt(zip) > 0) {
            this.zip = zip;
            } else {
            throw new IllegalArgumentException("Invalid zip code. Zip code must be a positive number.");
            }
        }    
        

    public double getAppraisalPrice(){
        return this.appraisalPrice;
    }


    protected void setAppraisalPrice(int appraisalPrice) {
        this.appraisalPrice = appraisalPrice;
    }
    
    public double getListPrice(){
        return this.listPrice;
    }


    public abstract int calculateAppraisalPrice();

    public void setListPrice(double listingPrice) {
        this.listPrice = listingPrice;
    }
}