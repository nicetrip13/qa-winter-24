package model;

public class Chess {
    private String name = "chess";
    private String type = "mindGame";
    private String place = "india";
    private String date = "6A.D.";
    private int players = 2;
    private String gameColors = "blackAndWhite";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public String getGameColors() {
        return gameColors;
    }

    public void setGameColors(String gameColors) {
        this.gameColors = gameColors;
    }
}
