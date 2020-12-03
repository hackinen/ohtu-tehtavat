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
public class Or implements Matcher {
    private Matcher[] matchers;
    
    public Or(Matcher... matches) {
        this.matchers = matches;
    }
    
    @Override
    public boolean matches(Player player) {
        for (Matcher m : matchers) {
            if (m.matches(player)) {
                return true;
            }
        }
        return false;
    }
}
