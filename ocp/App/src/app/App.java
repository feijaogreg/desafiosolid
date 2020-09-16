/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
/**
 *
 * @author Matheus
 */
import app.genres.*;

public class App
{
    public static void main( String[] args )
    {
        Game game = new Game();

        String rpg = game.getType(new Rpg());
        String shooter = game.getType(new Shooter());
        String adventure = game.getType(new Adventure());


        System.out.println("Gênero: " + rpg);
        System.out.println("Gênero: " + shooter);
        System.out.println("Gênero: " + adventure);

    }
}