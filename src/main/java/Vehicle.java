public class Vehicle {

    private String brand;
    private String mmodel;
    private String year;

    public Vehicle() {
    }

    public Vehicle(String brand, String mmodel, String year) {
        this.brand = brand;
        this.mmodel = mmodel;
        this.year = year;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMmodel() {
        return mmodel;
    }

    public void setMmodel(String mmodel) {
        this.mmodel = mmodel;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
