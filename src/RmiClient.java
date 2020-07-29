import java.rmi.Naming;

public class RmiClient {

    public RmiClient() {
        try {
            RmiServerInterface c = (RmiServerInterface) Naming.lookup("rmi://127.0.0.1:1099/objetoHola");

            System.out.println(c.saluda());
        } catch (Exception i) {
            System.out.println("Problema encontrado: " + i);
        }
    }

    public static void main(String args[]) {
        new RmiClient();
    }
}
