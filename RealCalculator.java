import java.rmi.RemoteException;

public class RealCalculator extends java.rmi.server.UnicastRemoteObject implements Calculator {
    
    public RealCalculator() throws RemoteException {
        super();
    }

    public long add(long a, long b) throws RemoteException {
        return a + b;
    }
    
    public long sub(long a, long b) throws RemoteException {
        return a - b;
    }
    
    public long mul(long a, long b) throws RemoteException {
        return a * b;
    }
    
    public long div(long a, long b) throws RemoteException {
        return a / b;
    }
    
    public long pow(long a, int b) throws RemoteException {
        
        if (b == 0)
            return 1;
        else
            return a * pow(a, b - 1);
    }
}