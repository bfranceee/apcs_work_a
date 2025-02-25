class Unicycle implements Vehicle {
    public String getName() {
        return "Unicycle";
    }
    public int wheelCount() { 
        return 1; 
    }
    public boolean isHumanPowered() { 
        return true;
    }
}