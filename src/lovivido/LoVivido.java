/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

/**
 * Calcula el número de meses días y años vividos según una edad introducida
 * @author asotodominguez
 */

public class LoVivido {

    /**
     * Método principal
     * @param args 
     */
    
    public static void main(String[] args) {

        String n,e;
        int m,d,h,a; 

        //Creamos el objeto
        Calculos obj1 = new Calculos(); 
        
        //Entrada de datos
        n = JOptionPane.showInputDialog ("Escriba su nombre: ");
        e = JOptionPane.showInputDialog ("Escriba su edad: ");

        a = Integer.parseInt (e);

        //Instanciamos los objetos
        m = obj1.calcularM(a);
        d = obj1.calcularD(a);
        h = obj1.calcularH(d);
        
        //Salida
        JOptionPane.showMessageDialog(null,  "Meses: "  +m,"Numero de meses vividos de " +n,JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Días: " +d,"Numero de días vividos de "+n,JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Horas: " +h,"Numero de horas vividos de "+n,JOptionPane.INFORMATION_MESSAGE);
        
        //Fin
        System.exit (0);

    }
   
}
