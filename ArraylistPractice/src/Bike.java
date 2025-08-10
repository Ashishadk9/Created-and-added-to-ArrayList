public class Bike extends Vehicle{
    private double price;
    private String company;
    public Bike(String name, String modelNo, double price, String company) {
        super(name, modelNo);
        this.price = price;
        this.company = company;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
}
