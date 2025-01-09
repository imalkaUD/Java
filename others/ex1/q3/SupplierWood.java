package q3;

public class SupplierWood extends Thread {
	
    private final FactorySimulation factory;

    public SupplierWood(FactorySimulation factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(600);  // Supply interval
                factory.supplyWood();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}