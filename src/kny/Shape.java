/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kny;

/**
 *
 * @author norbert.roland.kny
 */
public class Shape {
    //private String name;
    String name = "Geom shape";
    //prepouzija sa v potomcich        
    public String getShapeName(){
        return this.getClass().getSimpleName();
    }
    //je treba ju prekryt v potomcich
    public double area(){
    return 0;
    }
    
    @Override
    public String toString(){
        return name + ":" + getShapeName();
    }
}
