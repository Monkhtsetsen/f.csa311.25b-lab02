package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    private Shape shape;
    
    public Renderer( Shape shape) {
        this.shape = shape;
    }

    public void draw() {
      

        // assume implementation
        System.out.println("Drawing " + shape.getName());
        System.out.println("Its area is " + shape.getArea());
    

    }
}
