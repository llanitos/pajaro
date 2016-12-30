/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pajaro;

/**
 *
 * @author llanos
 */
public class Pajaro {

        String nombre;
        int posX, posY;
        

        public Pajaro (String nombre, int posX, int posY) {
            this.nombre=nombre;
            this.posX=posX;
            this.posY=posY;
        }
        
        double volar (int posX, int posY) {
            double desplazamiento = Math.sqrt(posX*posX + posY*posY);
            this.posX += posX;
            this.posY += posY;
            return desplazamiento;
        }
        
        public String toString() {
            return ("El pajaro " + this.nombre + " esta en la posicion (" + this.posX + "," + this.posY + ").");
        }
        
    public static void main(String[] args) {
        
        Pajaro loro = new Pajaro("Lucy", 50, 50);
        double d = loro.volar(50, 50);
        System.out.println("El desplazamiento has sido: " + d);
        
    }
    
}
