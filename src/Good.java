import java.util.ArrayList;

public abstract class Good {
    private double price;
    private String model;
    private int count = 3;
    private int sold;
    private int korzina;
    private ArrayList<Good> gds = new ArrayList<Good>();


    public Good() {
    }

    @Override
    public String toString() {
        return "Good{" +
                "price = " + price +
                ", model = '" + model + '\'' +
                ", count = " + count +
                ", sold = " + sold +
                '}';
    }

    public Good(double price, String model, int count) {
        this.price = price;
        this.model = model;
        this.count = count;
    }

    public void showDetails(){};

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int getKorzina() {
        return korzina;
    }

    public void setKorzina(int korzina) {
        this.korzina = korzina;
    }

    public ArrayList<Good> getGds() {
        return gds;
    }

    public void setGds(ArrayList<Good> gds) {
        this.gds = gds;
    }

    public Good getGood(int index){
        return gds.get(index);
    }
}
