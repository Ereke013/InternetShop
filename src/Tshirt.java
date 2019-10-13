public class Tshirt extends  Wearing{
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public String toString() {
        return "Tshirt{" +
                "model = " + getModel() +
                ", kategoria = " + getKategoria() +
                ", size = "+ getSize()  +
                ", color = " + getColor()+
                ", material = '" + material + '\'' +
                ", kolichestvo = "+ getCount() +
                '}' + "Price = " + getActualPrice()+ "$"+
                (getPrice() == getActualPrice() ? "" : ", discount 20% => " + getPrice())+ "$";
    }
}
