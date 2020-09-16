/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsp;

/**
 *
 * @author Matheus
 */
public class Rectangle {


    int width;
    int height;
    public Rectangle(){}
    public Rectangle(int w,int h) {
        this.width = w;
        this.height = h;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    
    public int getArea() {
        return this.width * this.height;
    }
    
    public static void setDimensions(Rectangle r,int w,int h) {
          r.setWidth(w);
          r.setHeight(h);
    }
}
