import java.rmi.*;
import java.rmi.registry.LocateRegistry;


class RmiServer {

    public RmiServer() {
        try {
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://127.0.0.1:1099/objetoHola", new RmiServerImpl());

            System.out.println("Servidor Hola Preparado");
        } catch (Exception i) {
            System.out.println("Problema encontrado: " + i);
        }
    }

    public static void main(String args[]) {
        new RmiServer();
    }
}