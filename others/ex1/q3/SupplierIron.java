package q3;

public class SupplierIron extends Thread {
    private final FactorySimulation factory;

    public SupplierIron(FactorySimulation factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(600);  // Supply interval
                factory.supplyIron();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
