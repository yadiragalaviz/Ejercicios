/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

/**
 *
 * @author Dell
 */
public class Estadistica {
    int vector[]={100,80,100,70,50,50,80,80,70,80};
    int fre[]= new int [10];
    void frecuencia(){
        for(int i=1;i <vector.length;i++) {
            fre[(vector[i])/10-1]++;
        }
        
    }
    void despliega(){
        for(int i=1;i <fre.length;i++) {
            System.out.println(i*10 +"Frecuencia" +fre[i-1]);
        }
                 
    }
    public static void main(String[] args) {
        Estadistica obj=new Estadistica();
        obj.frecuencia();
        obj.despliega();
    }
    
    
}
