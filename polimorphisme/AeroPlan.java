/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphisme;

/**
 *
 * @author mimbu
 */

    public class AeroPlan extends Vehicle {
    public void walk(){
        System.out.println("flying");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AeroPlan masuk= new AeroPlan();
        masuk.function();
        masuk.fuels();
        masuk.walk();
    }
    }

