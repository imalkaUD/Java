package q3;

public class SupplierCement extends Thread {
    private final FactorySimulation factory;

    public SupplierCement(FactorySimulation factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(600);  // Supply interval
                factory.supplyCement();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}