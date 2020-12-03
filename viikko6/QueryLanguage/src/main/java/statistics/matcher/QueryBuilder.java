/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

/**
 *
 * @author hiira
 */
public class QueryBuilder {
    private Matcher m;
    
    public QueryBuilder() {
        this.m = new All();
    }
    
    public Matcher build() {
        Matcher palautettava = m;
        m = new All();
        
        return palautettava;
    }
    
    public QueryBuilder playsIn(String team) {
    
        m = new And(m, new PlaysIn(team));
        
        return this;
    }
    
    public QueryBuilder hasAtLeast(int val, String cat) {
        m = new And(m, new HasAtLeast(val,cat));
        return this;
    }
    
    public QueryBuilder hasFewerThan(int val, String cat) {
        m = new And(m, new HasFewerThan(val,cat));
        return this;
    }
}
