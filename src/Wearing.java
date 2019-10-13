public class Wearing extends Good {
    private String size;
    private String color;
    private String kategoria;
    private String name;


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKategoria() {
        return kategoria;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    @Override
    public String toString() {
        return "Wearing{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", kategoria='" + kategoria + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
