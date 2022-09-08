package Poo.Clases;

public class SmartDevice {
    String marca;
    String modelo;
    double capBateria;
    double capMemoria;
    String color;


    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, double capBateria, double capMemoria, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.capBateria = capBateria;
        this.capMemoria = capMemoria;
        this.color = color;

    }

    public void descargar(double timeUso) {
        this.capBateria -= timeUso;
    }

    public void carga(double timeCarga) {
        this.capBateria += timeCarga;
    }
}
