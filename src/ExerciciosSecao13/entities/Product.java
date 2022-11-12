package entities;

public class Product {
    private String name;
    private Double prices;
    
    public Product(){
    }
    
    public Product(String name, Double prices){
        this.name = name;
        this.prices = prices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrices() {
        return prices;
    }

    public void setPrices(Double prices) {
        this.prices = prices;
    }
    
}
