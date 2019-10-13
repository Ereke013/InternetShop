public class Sneakers extends Wearing {
    private String season;

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Sneakers{" +
                "model = " + getModel() +
                ", kategoria = " + getKategoria() +
                ", size = "+ getSize() +
                ", color = " + getColor() +
                ", season = '" + season + '\'' +
                ", count = "+ getCount() +
                '}' + " price = " + getPrice() + "$";
    }
}
