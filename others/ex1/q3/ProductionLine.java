package q3;

public class ProductionLine extends Thread {
    private final FactorySimulation factory;

    public ProductionLine(FactorySimulation factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);  // Production interval
                factory.produceProduct();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}