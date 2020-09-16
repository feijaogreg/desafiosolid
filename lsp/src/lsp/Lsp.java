/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsp;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
import lsp.Rectangle;
public class Lsp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int w = 3;
        int h = 4;
        
        Rectangle ret = new Rectangle();
        
        ret.setWidth(w);
        ret.setHeight(h);
        int a = ret.getArea();
        
        System.out.println("A área é: " + a);
        
        
//        System.out.println(Rectangle.getArea());
        
    }
    
}
