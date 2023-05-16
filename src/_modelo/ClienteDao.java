package _modelo;

public class ClienteDao {
    private IDAO conexion;

    public ClienteDao(IDAO conexion) {
        this.conexion = conexion;
    }

    public String insertar(Cliente c1) {

        // Por ejemplo, imprimir el nombre y NIF del cliente insertado en el DAO de Cliente
        System.out.println("Insertando cliente en el DAO de Cliente:");
        System.out.println("Nombre: " + c1.getNombre());
        System.out.println("NIF: " + c1.getNIF());

        // Utilizar la conexión para insertar el cliente
        String resultado = conexion.insertar(c1);

        // Devolver el resultado de la inserción
        return resultado;
    }
}
