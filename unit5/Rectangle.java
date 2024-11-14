public class Rectangle {
    private double base;
    private double height;
    
    public Rectangle(double baseIn, double heightIn){
        base = baseIn;
        height = heightIn;
}
    public double Base(){
        return base;
    }
    public double Height(){
        return height;
    }
    public double Area(){
        return base * height;
    }
    public double Perimeter(){
        return (base * 2)  + (height * 2);
    }
    public double Diagonal(){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
}