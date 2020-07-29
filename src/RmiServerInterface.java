import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiServerInterface extends Remote {
    String saluda() throws RemoteException;
}
