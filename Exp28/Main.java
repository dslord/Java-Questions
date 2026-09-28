package Exp28;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

interface Hello extends Remote {
    String message() throws RemoteException;
}

class HelloImpl extends UnicastRemoteObject implements Hello {

    HelloImpl() throws RemoteException {
        super();
    }

    public String message() throws RemoteException {
        return "Hello from RMI Server";
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);

            HelloImpl obj = new HelloImpl();

            Naming.rebind("HelloService", obj);

            System.out.println("RMI Server is running...");
            System.out.println(obj.message());

            System.exit(0);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}