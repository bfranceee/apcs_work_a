class Motorcycle implements Vehicle {
    public String getName() { 
        return "Motorcycle";
    }
    public int wheelCount() { 
        return 2; 
    }
    public boolean isHumanPowered() { 
        return false; 
    }
}