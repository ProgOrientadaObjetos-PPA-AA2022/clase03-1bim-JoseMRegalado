/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejecutable04 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();
        
        System.out.println("Ingrese el nombre del hospital");
        String n1 = leer.nextLine();
        h1.establecerNombre(n1);
        
        System.out.println("Ingrese el número de camas del hospital");
        int nc1 = leer.nextInt();
        h1.establecerNumeroCamas(nc1);
        
        System.out.println("Ingrese el valor del presupuesto del hospital");
        double valor1 = leer.nextDouble();
        h1.establecerPresupuesto(valor1);
        leer.nextLine();
        
        System.out.println("Ingrese el nombre del hospital");
        n1 = leer.nextLine();
        h2.establecerNombre(n1);
        
        System.out.println("Ingrese el número de camas del hospital");
        nc1 = leer.nextInt();
        h2.establecerNumeroCamas(nc1);
        
        System.out.println("Ingrese el valor del presupuesto del hospital");
        valor1 = leer.nextDouble();
        h2.establecerPresupuesto(valor1);
        leer.nextLine();
        
        System.out.println("Ingrese el nombre del hospital");
        n1 = leer.nextLine();
        h3.establecerNombre(n1);
        
        System.out.println("Ingrese el número de camas del hospital");
        nc1 = leer.nextInt();
        h3.establecerNumeroCamas(nc1);
        
        System.out.println("Ingrese el valor del presupuesto del hospital");
        valor1 = leer.nextDouble();
        h3.establecerPresupuesto(valor1);
        leer.nextLine();
        
        
        int sumac = h1.obtenerNumeroCamas() + h2.obtenerNumeroCamas() +
                h3.obtenerNumeroCamas();

        
        double suma = h1.obtenerPresupuesto() + h2.obtenerPresupuesto() +
                h3.obtenerPresupuesto();
        
      
        System.out.printf("La suma de presupuestos es %.2f\n", suma);
        System.out.printf("La suma de camas es %d\n", sumac);
        System.out.println("Los hospitales ingresados fueron: ");
        System.out.printf("%s - %s - %s\n", h1.obtenerNombre(), 
                h2.obtenerNombre(), h3.obtenerNombre());
        
    }
}
