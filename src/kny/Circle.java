/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kny;

/**
 *
 * @author norbert.roland.kny
 */
public class Circle implements AreaComputable{
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    
//    public double area(int r) {
//        return Math.PI*r*r;
//    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }

    @Override
    public double circum() {
        return 2*Math.PI*r;
    }
    
}
