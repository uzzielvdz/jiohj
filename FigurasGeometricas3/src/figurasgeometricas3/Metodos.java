/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas3;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author uzziel
 */
public class Metodos {
    
    static int radioC, alturaR, alturaT, baseT, anchoR, ladoC;

    FigurasGeometricas3 Fig = new FigurasGeometricas3();
    public void Plo()
    {
        radioC = Integer.parseInt(JOptionPane.showInputDialog("Cual es el valor del radio? "));
        Fig.AreaCirculo(radioC);
        
        ladoC = Integer.parseInt(JOptionPane.showInputDialog("Cual es el valor del lado"));
        Fig.AreaCuadrado(ladoC);
        
        baseT = Integer.parseInt(JOptionPane.showInputDialog("Cual es el valor de la base del triangulo? "));
        alturaT = Integer.parseInt(JOptionPane.showInputDialog("Cual es el valor de la altura del triangulo? "));
        Fig.AreaTriangulo(alturaT, baseT);
        
        
        anchoR = Integer.parseInt(JOptionPane.showInputDialog("Cual es el valor de la base del rectangulo? "));
        alturaR = Integer.parseInt(JOptionPane.showInputDialog("Cual es el valor de la altura del rectangulo?"));
        Fig.AreaRectangulo(anchoR, alturaR);
        
    }
}

