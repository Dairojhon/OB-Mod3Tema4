package Poo.Clases;

public class SmartPhone extends SmartDevice
{
    Double capAlmacenaje;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, double capBateria, double capMemoria, String color, Double capAlmacenaje) {
        super(marca, modelo, capBateria, capMemoria, color);
        this.capAlmacenaje = capAlmacenaje;
    }

    public void almacenar(double tamArchivo)
    {
        this.capAlmacenaje-=tamArchivo;
    }
    public void ElimArchivo(double tamArchivo)
    {
        this.capAlmacenaje+=tamArchivo;
    }

    @Override
    public String toString() {
        return "SmartPhone {" +
                "capAlmacenaje=" + capAlmacenaje +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capBateria=" + capBateria +
                ", capMemoria=" + capMemoria +
                ", color='" + color + '\'' +
                '}';
    }
}
