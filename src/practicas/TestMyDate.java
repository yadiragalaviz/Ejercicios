/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

/**
 *
 * @author Dell
 */
public class TestMyDate {
  public static void main(String[] args) {
        MyDate today = new MyDate(15,6, 1982);
        today.print();
    }
}
    class MyDate {
        private int day = 1;
        private int month = 1;
        private int year = 2000;
        public MyDate(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public void print(){
            System.out.println("Tu Fecha de Nacimiento YADIRA es: " + day + "/" + month + "/" + year);
        }  
}
