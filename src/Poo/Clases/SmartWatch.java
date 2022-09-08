package Poo.Clases;

public class SmartWatch extends SmartDevice {
    double tamPulsera;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, double capBateria, double capMemoria, String color, double tamPulsera) {
        super(marca, modelo, capBateria, capMemoria, color);
        this.tamPulsera = tamPulsera;
    }

    public void apretarPulsera(double presionPulsera)
    {
        this.tamPulsera-=presionPulsera;
    }
    public void soltarPulsera (double sueltaPulsera)
    {
        this.tamPulsera+=sueltaPulsera;
    }

    @Override
    public String toString() {
        return "SmartWatch {" +
                "tamPulsera=" + tamPulsera +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capBateria=" + capBateria +
                ", capMemoria=" + capMemoria +
                ", color='" + color + '\'' +
                '}';
    }
}
