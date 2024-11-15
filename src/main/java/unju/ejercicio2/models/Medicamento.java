package unju.ejercicio2.models;

public class Medicamento {
    private int codigo;
    private String descripcion;
    private double precioUnitario;
    private int stockDisponible;

    public Medicamento(int codigo, String descripcion, double precioUnitario, int stockDisponible) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.stockDisponible = stockDisponible;
    }

    public Medicamento() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }
}
