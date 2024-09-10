package ejerccio2;
public class veiculos {
    private String marca;
    private String modelo;
    private double precio;

    public veiculos(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String mostrarDetalles() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Precio: $" + String.format("%.2f", precio);
    }

    public double getPrecio() {
        return precio;
    }
}
