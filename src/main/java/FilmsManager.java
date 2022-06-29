public class FilmsManager {

    private int limit;
    private  NameFilm[] films = new NameFilm[0];

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public FilmsManager() {
        limit = 10;
    }


    public void save(NameFilm film) {
        NameFilm[] tmp = new NameFilm[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public NameFilm[] findAll() { return films; }

    public NameFilm[] findLast() {
        NameFilm[] ans;
        if (limit < films.length) {
            ans = new NameFilm[limit];
        } else {
            ans = new NameFilm[films.length];
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = films[films.length - i - 1];
        }
        return ans;

    }


}
