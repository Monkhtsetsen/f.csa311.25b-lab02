package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
   //public->private
    private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
    //nemelt 
    @Override
    public double getArea() {
        return sideLen * sideLen;
    }
    public double getSideLen(){
        return sideLen;
    }
    public String getName() {
        return "Square";
    }
}
