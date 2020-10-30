package ohtuesimerkki;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.*;

import ohtuesimerkki.*;

public class StatisticsTest {
    
    Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
        }
    };
 
    Statistics stats;
    @Before
    public void setUp() {
        this.stats = new Statistics(readerStub);
    }

    @Test
    public void searchReturnsTheCorrectPlayer() {
        Player p1 = readerStub.getPlayers().get(0);
        assertEquals(p1, stats.search("Semenko"));
    }

    @Test
    public void searchReturnsNullWhenPlayerNotFound() {
        assertEquals(null, stats.search("Sukunimi"));
    }

    @Test
    public void teamReturnsAListOfPlayersInGivenTeam() {
        ArrayList<Player> teamMembers = new ArrayList<>();
        teamMembers.add(readerStub.getPlayers().get(0));
        teamMembers.add(readerStub.getPlayers().get(2));
        teamMembers.add(readerStub.getPlayers().get(4));

        assertEquals(teamMembers, stats.team("EDM"));
    }

    @Test
    public void teamReturnsEmptyListWhenNoPlayersInGivenTeamWereFound() {
        ArrayList<Player> list = new ArrayList<>();

        assertEquals(list, stats.team("PELICANS"));
    }

    @Test
    public void topScorersReturnsThreeBestPlayersCorrectly() {
        ArrayList<Player> top = new ArrayList<>();
        top.add(readerStub.getPlayers().get(4));
        top.add(readerStub.getPlayers().get(1));
        top.add(readerStub.getPlayers().get(3));

        assertEquals(top, stats.topScorers(2));
    }
    
}
