import java.rmi.Naming;

public class CalculatorServer {

    public CalculatorServer() {
        try {
            RealCalculator c = new RealCalculator();
            Naming.rebind("rmi://localhost/CalculatorService", c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CalculatorServer cs = new CalculatorServer();
    }
}