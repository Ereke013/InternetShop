public class SmartPhone extends Device {
    private double mgpx;
    private String generation;

    public double getMgpx() {
        return mgpx;
    }

    public void setMgpx(double mgpx) {
        this.mgpx = mgpx;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    @Override
    public int getPerformance() {
        return 0;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                " model = " + getModel() +
                ", generation = " + getGeneration() +
                ", mgpx = " + mgpx +
                ", ram = " + ram +
                ", count = " + getCount() +
                '}' + " price = " + getActualPrice()+ "$"+
                (getPrice() == getActualPrice() ? "" : ", discount 20% => " + getPrice())+ "$";
    }

}
