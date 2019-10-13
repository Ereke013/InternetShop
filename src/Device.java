public abstract class Device extends Good{
    String cpu;
    int ram;
    public  int getPerformance(){
        return 0;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Device{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                '}';
    }
}
