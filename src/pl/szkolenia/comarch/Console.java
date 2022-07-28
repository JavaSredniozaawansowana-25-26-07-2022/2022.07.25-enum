package pl.szkolenia.comarch;

public enum Console {
    PS5(299.99, "Sony", "PlayStation 5", 2018),
    PS4(299.99, "Sony", "PlayStation 4", 2012),
    XBOX360(299.99, "Microsoft", "XBox 360", 2006),
    NINTENDO(299.99, "Nintendo", "Switch", 2014);

    private double price;
    private String brand;
    private String model;
    private int year;

    Console(double price, String brand, String model, int year) {
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
