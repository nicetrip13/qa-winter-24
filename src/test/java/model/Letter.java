package model;

public class Letter {
    private String author = "lermontov";
    private String name = "parus";
    private int date = 1832;
    private int numberOfSimbols = 420;
    private String genre = "poem";
    private String type = "letterOnPaper";

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getNumberOfSimbols() {
        return numberOfSimbols;
    }

    public void setNumberOfSimbols(int numberOfSimbols) {
        this.numberOfSimbols = numberOfSimbols;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
