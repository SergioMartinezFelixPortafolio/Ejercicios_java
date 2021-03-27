/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1Planetas;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Ejercicio1Planetas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Welcome! \nWhat's your name?");
        Scanner question=new Scanner (System.in);
        String name=question.nextLine();
        System.out.println("\nIn what year were you born? ");
        short year=Short.parseShort(question.nextLine());  
        System.out.println ("\nHow much do you weight? ");
        float weight=question.nextFloat();
        System.out.println("\nNice to meet you "+name);
        short now=2021;
        System.out.println("\nYou are "+(now-year)+ " years old");
        System.out.println("\nYou will be 85 years old in "+ ((year+85)-now)+" years from now");
        
        System.out.println("\nLet's calculate your weight in the different planets of the universe ");
        System.out.println("\nYou would weight "+(weight*2.5277)+"kgs on Jupiter");
        System.out.println("You would weight "+(weight*0.9044)+"kgs on Venus");
        System.out.println("You would weight "+(weight*0.8861)+"kgs on Uranus");
        System.out.println("You would weight "+(weight*0.3784)+"kgs on Mars");
        System.out.println("You would weight "+(weight*0.3774)+"kgs on Mercury");
        System.out.println("You would weight "+(weight*1.064)+"kgs on Saturn");
        System.out.println("You would weight "+(weight*1.136)+"kgs on Neptune");
        System.out.println("You would weight "+(weight*0.0632)+"kgs on Pluton");

        boolean first=(((weight*0.3774)+(weight*0.9044))>(weight*0.3784));
        System.out.println("\nIf you add your weight on Mercury and Venus together, is it greater than your weight on Mars? "+ (first));
        
        boolean second=((weight*2.5277)>((weight)+(weight*0.3784)));
        System.out.println("\nIs your weight on Jupiter greater than your weight on the Earth and Mars together? "+ second);
  
        System.out.println("Thank you for using my first program. Have a nice day! ");
                
        
    }
    
}
