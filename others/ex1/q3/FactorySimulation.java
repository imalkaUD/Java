package q3;

public class FactorySimulation {
    private static int iron = 0;
    private static int wood = 0;
    private static int cement = 0;

    public static void main(String[] args) {
    	
    	
        FactorySimulation factory = new FactorySimulation();
        
        SupplierIron si = new SupplierIron(factory);
        SupplierWood sw = new SupplierWood(factory);
        SupplierCement sc = new SupplierCement(factory);
        ProductionLine p = new ProductionLine(factory);

        // Create and start supplier and production line threads
        si.start();
        sw.start();
        sc.start();
        p.start();
    }

    // Method to handle Iron supply
    public synchronized void supplyIron() {
        iron++;
        System.out.println("Supplied 1 Iron. Iron Inventory: " + iron);
        notifyAll();  // Notify the production line
    }

    // Method to handle Wood supply
    public synchronized void supplyWood() {
        wood++;
        System.out.println("Supplied 1 Wood. Wood Inventory: " + wood);
        notifyAll();  // Notify the production line
    }

    // Method to handle Cement supply
    public synchronized void supplyCement() {
        cement++;
        System.out.println("Supplied 1 Cement. Cement Inventory: " + cement);
        notifyAll();  // Notify the production line
    }

    // Method to produce a product if sufficient resources are available
    public synchronized void produceProduct() {
        if (iron >= 1 && wood >= 2 && cement >= 1) {
            // Consume materials to produce a product
            iron--;
            wood -= 2;
            cement--;
            System.out.println("Product produced. Iron: " + iron + ", Wood: " + wood + ", Cement: " + cement);
        } else {
            System.out.println("Waiting for supplies...");
            try {
                wait();  // Wait for supplies if resources are insufficient
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
