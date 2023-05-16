package _presentacion;

import _modelo.*;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juan", "123456789");

        IDAO produccion = new AccesoProduccion();
        IDAO desarrollo = new AccesoDesarrollo();

        ClienteDao daoProduccion = new ClienteDao(produccion);
        ClienteDao daoDesarrollo = new ClienteDao(desarrollo);

        System.out.println("--- Insertando en entorno de producción ---");
        String resultadoProduccion = daoProduccion.insertar(c1);
        System.out.println("Resultado: " + resultadoProduccion);

        System.out.println("--- Insertando en entorno de desarrollo ---");
        String resultadoDesarrollo = daoDesarrollo.insertar(c1);
        System.out.println("Resultado: " + resultadoDesarrollo);
    }
}