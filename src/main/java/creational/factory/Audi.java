package factory;

class Audi implements Car {
	
    public void paintColor(String color) {
        System.out.println("Yellow");
    }
    
    public void setEngine(String engine) {
        System.out.println("1000cc Engine for Audi");  
    }
    
    public void setTyre(String tyre) {
        System.out.println("Apollo tyre for Audi");  
    }
    
    public String toString(){  
        return "Black Audi with 1000c";  
   } 
}
