/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.genres;

/**
 *
 * @author Matheus
 */

import app.GameType;

public class Rpg implements GameType{

    private String GAME_GENRE = "RPG - Role Playing Game";
    
    @Override
    public String getType() {
        return GAME_GENRE;
    }
}