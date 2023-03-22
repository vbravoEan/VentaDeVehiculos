package vehiculo.mundo;

public class Vehiculo {
    private String tipo;
    private String marca;
    private String modelo;
    private int anio;
    private int ejes;
    private int cilindrada;
    private double valor;
    private String placa;

    public Vehiculo(String tipo, String marca, String modelo, int anio, int ejes, int cilindrada, double valor, String placa) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.ejes = ejes;
        this.cilindrada = cilindrada;
        this.valor = valor;
        this.placa = placa;
    }

    // Getters y setters
    
    // Getters
    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public int getEjes() {
        return ejes;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public double getValor() {
        return valor;
    }

    public String getPlaca() {
        return placa;
    }
    
 // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // toString para mostrar información detallada del vehículo
    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", ejes=" + ejes +
                ", cilindrada=" + cilindrada +
                ", valor=" + valor +
                ", placa='" + placa + '\'' +
                '}';
    }

}
