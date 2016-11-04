package creational.factory;

class BMW implements Car {
	
    public void paintColor(String color) {
        System.out.println("Red");
    }
    
    public void setEngine(String engine) {
        System.out.println("800cc Engine for BMW");
    }
    
    public void setTyre(String tyre) {
        System.out.println("Apollo tyre for BMW");
    }
    
    public String toString() {
        return "Red BMW with 800cc";
    }
}
