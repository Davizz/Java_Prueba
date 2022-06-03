package miprimerproyecto.e.coches;

public class Coche {
	private int ruedas; //número de ruedas
    private int largo; //cm
    private int ancho; //cm
    private int motor; //cm3
    private int pesoChasi; //kilos
    private String color;
    private int pesoTotal;
    private boolean climatizado, asientosCuero;
 

    public Coche() {
        ruedas = 4;
        largo = 500;
        ancho = 300;
        motor = 1800;
        pesoChasi = 500;
    }

    public String getPeso() {
        return "Este coche pesa " + this.pesoChasi + " kilos, y ";
    }

    public String getRuedas() {
        return "tiene " + this.ruedas + " ruedas.";
    }

    public void setColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    public String getColor() {
        return "Todos los coches de este tipo son de color " + this.color + ".";
    }

    public void setAsientos(String asientosCuero) {
        if (asientosCuero.equalsIgnoreCase("si")) {
            this.asientosCuero = true;
        } else {
            this.asientosCuero = false;
        }
    }

    public String getAsientos() {
        if (this.asientosCuero == true) {
            return "El coche tiene asientos de cuero.";
        } else {
            return "El coche tiene asientos de serie.";
        }

    }

    public void setClimatizado(String climatizado) {
        if (climatizado.equalsIgnoreCase("si")) {
            this.climatizado = true;
        } else {
            this.climatizado = false;
        }
    }

    public String getClimatizado() {
        if (this.climatizado == true) {
            return "El coche tiene equipado el climatizador.";
        } else {
            return "El coche no tiene climatizador.";
        }

    }

    public void setPesoTotal() {
        int pesoCaroceria = 500;

        if (this.climatizado == true) {
            this.pesoChasi += 20;
        }
        if (this.asientosCuero == true) {
            this.pesoChasi += 50;
        }

        this.pesoTotal = this.pesoChasi + pesoCaroceria;
        
    }
    
    public String getPesoTotal(){
        return "El peso total del coche es de " + this.pesoTotal + " kilos.";
    }
}
