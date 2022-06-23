public class NameFilm {

    private String name;

    private String genre;

    private int id;


    public NameFilm(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() { return genre; }
}
