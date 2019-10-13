public class Computer extends Device {
    private Boolean ssd;
    private int memory;

    public Boolean getSsd() {
        return ssd;
    }

    public void setSsd(Boolean ssd) {
        this.ssd = ssd;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public int getPerformance() {
        return super.getPerformance();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model = " + getModel() +
                ", ssd = " + ssd +
                ", memory = " + memory +
                ", cpu = '" + cpu + '\'' +
                ", ram = " + ram +
                ", count = " + getCount() +
                '}' + " price = " + getPrice()+ "$";
    }
}
