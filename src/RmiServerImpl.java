import java.rmi.RemoteException;

class RmiServerImpl extends java.rmi.server.UnicastRemoteObject implements RmiServerInterface {
    //Contructor
    public RmiServerImpl() throws RemoteException {
        super();
    }

    public String saluda() throws RemoteException {
        return "Hola a todos";
    }

}
