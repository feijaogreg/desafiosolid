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

public class Square extends Rectangle {
    @Override
    public void setHeight(int h){
        super.setHeight(h);
        super.setWidth(h);
    }
    @Override
    public void setWidth(int w) {
        super.setWidth(w);
        super.setHeight(w);
    }
}
