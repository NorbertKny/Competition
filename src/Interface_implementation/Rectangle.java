/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_implementation;

import kny.*;

/**
 *
 * @author norbert.roland.kny
 */
public class Rectangle implements AreaComputable{
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double circum() {
        return 2*(a+b);
    }
    
    
}
