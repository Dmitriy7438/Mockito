public class PosterManager {

    private int countLastFilms;
    private  NameFilm[] films = new NameFilm[0];

    public PosterManager(int countLastFilms) {
        this.countLastFilms = countLastFilms;
    }

    public PosterManager() {
        this.countLastFilms = 10;
    }

    PosterManager men = new PosterManager();

    public void save(NameFilm film) {
        int length =  films.length + 1;
        NameFilm[] tmp = new NameFilm[length];
        for (int i = 0; i < films.length; i++)
            tmp[i] = films[i];
        int lastIndex = tmp.length -1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public NameFilm[] findAll() { return films; }

    public NameFilm[] findLast() {
        NameFilm[] findLast = new NameFilm[films.length];
        for (int i = 0; i < findLast.length; i++) {
            int index = findLast.length - i - 1;
            findLast[i] = films[index];
        }
        return findLast;

    }


}
