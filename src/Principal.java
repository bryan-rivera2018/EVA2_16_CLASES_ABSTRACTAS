/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ostra oPalCocktail = new Ostra();
        oPalCocktail.movimiento();
        
    }
    
}
class Almejas extends Animal{
    
}
final class Ostra extends Animal{//limitar la herencial con final
    //una clase final no se puede heredar de ostra
    
}
abstract class Animal{//UNA que no sirve para generar objetos, solo sirve como base para herencia
    public void movimiento(){
        System.out.println("Moviento indefinido");
    }
}