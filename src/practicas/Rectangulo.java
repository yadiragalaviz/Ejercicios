/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

/**
 *
 * @author Dell
 */
public class Rectangulo {
    private int largo=10;
private int ancho =2;


public static void main(String[] args){
int area= 0;
Rectangulo rectangulo = new Rectangulo();
area = rectangulo.largo * rectangulo.ancho;
System.out.println("area = " + area);

}
}
