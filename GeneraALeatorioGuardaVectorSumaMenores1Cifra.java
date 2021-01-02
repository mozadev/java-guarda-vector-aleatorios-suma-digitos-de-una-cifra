
package prueba3;

import javax.swing.JOptionPane;

public class prueba3 {
   public static void main(String[] args) {
        int aleatorio,x,sum=0;
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos: "));
        int vec[]=new int[x];      
        for(int i=0;i<x;i++){
            aleatorio=(int)(Math.random()*300);
            vec[i]=aleatorio;
            if(vec[i]<10){
                sum+=vec[i];
            }
        }
        for(int i=0;i<x;i++){
            System.out.print(vec[i]+", ");    
        }
        System.out.println("\nLa suma de numeros de 1 cifra es: "+sum);
        
    }
    
}