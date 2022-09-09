package Poo.Interfaces;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Este es el metodo save() para guardar un coche");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Este es el metodo findAll() para mostrar los coches");
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Este es el metodo delete() para eliminar un coche");
    }
}
