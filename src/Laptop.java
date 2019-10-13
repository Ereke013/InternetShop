public class Laptop extends Computer{
    private double weight;
    private Boolean touch;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Boolean getTouch() {
        return touch;
    }

    public void setTouch(Boolean touch) {
        this.touch = touch;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "model = " + getModel() +
                ", weight = " + weight +
                ", touch = " + touch +
                ", cpu = '" + cpu + '\'' +
                ", ram = " + ram +'\''+
                ", count = " + getCount() +
                '}' + " price = " + getActualPrice()+ "$"+
                (getPrice() == getActualPrice() ? "" : ", discount 20% => " + getPrice())+ "$";
    }
}
