
package lovivido;

import javax.swing.JOptionPane;

/**
 * 
 * @author asotodominguez
 */

public class Calculos {
    
    /**
     *
     * @param a
     * @return cálculo de meses vividos
     */
    
    public int calcularM(int a){
        return a*12;
    }
    
    /**
     * 
     * @param a
     * @return cálculo de días vividos
     */
    
    public int calcularD(int a){
        return a*365;
    }
    
    /**
     * 
     * @param d
     * @return cálculo de horas vividas
     */
    
    public int calcularH(int d){
        return d*24;
    }
    
}
