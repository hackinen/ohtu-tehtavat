package ohtuesimerkki;

public class Player implements Comparable<Player> {

    private String name;
    private String team;
    private int goals;
    private int assists;

    public Player(String name, String team, int goals, int assists) {
        this.name = name;
        this.team = team;
        this.goals = goals;
        this.assists = assists;
    }
        
    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getPoints() {
        return goals + assists;
    }

    @Override
    public String toString() {      
        return String.format("%-20s",name) + " " + team + " " + String.format("%2d",goals) + " + " 
                + String.format("%2d",assists) + " = " + getPoints();
    }

    public int compareTo(Player t) {
        return t.getPoints()-this.getPoints();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + assists;
        result = prime * result + goals;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((team == null) ? 0 : team.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Player other = (Player) obj;
        if (assists != other.assists)
            return false;
        if (goals != other.goals)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (team == null) {
            if (other.team != null)
                return false;
        } else if (!team.equals(other.team))
            return false;
        return true;
    }

    
}
