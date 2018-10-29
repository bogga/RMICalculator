import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    
    public static void main(String[] args) {
        try {
            Calculator c = (Calculator) Naming.lookup("rmi://localhost/CalculatorService");

            System.out.println("3+21="+ c.add(3, 21));		
            System.out.println("18-9="+ c.sub(18, 9));
            System.out.println("4*17="+ c.mul(4, 17));
            System.out.println("70/10="+ c.div(70, 10));
	        System.out.println("2^5="+ c.pow(2, 5));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
        catch (NotBoundException e) {
            e.printStackTrace();
        }
        catch (java.lang.ArithmeticException e) {
            e.printStackTrace();
        }
 
    }
}