public class coche extends Vehiculo {
    String color;


    public coche(String marca, String color) {
        super(marca);
        this.color = color; //esto señala al atributo de dentro
    }

    //Getter
    public String getColor() {
        return color;
    }

    //Setter
    public void setColor(String color) {
        this.color = color;
    }
}
