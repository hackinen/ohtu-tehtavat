/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

import statistics.Player;

/**
 *
 * @author hiira
 */
public class HasFewerThan implements Matcher {
    private Matcher matcher;
    
    public HasFewerThan(int value, String category) {
        this.matcher = new Not(new HasAtLeast(value,category));
    }
    
    @Override
    public boolean matches(Player player) {
        return matcher.matches(player);
    }
}
