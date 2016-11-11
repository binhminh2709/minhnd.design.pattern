package gangofFour.creational.factory;

class Ferrari implements Car {
	
    public void paintColor(String color) {
        System.out.println("Green");
    }
    
    public void setEngine(String engine) {
        System.out.println("1800cc Engine for Ferrari");
    }
    
    public void setTyre(String tyre) {
        System.out.println("Apollo tyre for Ferrari");
    }
    
    public String toString() {
        return "Yello Ferrari with 1800cc";
    }
}
