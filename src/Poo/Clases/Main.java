package Poo.Clases;

public class Main {
    public static void main(String[] args)
    {
        SmartDevice xiaomi10= new SmartPhone("xiaomi","10",3000,4,"blanco",256.0);

        SmartDevice appleWatch=new SmartWatch();

        xiaomi10.descargar(5);

        System.out.println(xiaomi10.toString());

        System.out.println(appleWatch.toString());
    }
}