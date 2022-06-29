import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    NameFilm first = new NameFilm(1, "first", "melodrama");
    NameFilm second = new NameFilm(2, "second", "melodrama");
    NameFilm third = new NameFilm(3, "third", "melodrama");
    NameFilm fourth = new NameFilm(4, "fourth", "melodrama");
    NameFilm fifth = new NameFilm(5, "fifth", "melodrama");
    NameFilm sixth = new NameFilm(6, "sixth", "melodrama");
    NameFilm seventh = new NameFilm(7, "seventh", "melodrama");
    NameFilm eighth = new NameFilm(8, "eighth", "melodrama");
    NameFilm ninth = new NameFilm(9, "ninth", "melodrama");
    NameFilm tenth = new NameFilm(10, "tenth", "melodrama");
    NameFilm eleventh = new NameFilm(11, "eleventh", "melodrama");

    @Test
    public void myTest1() {
        FilmsManager manager = new FilmsManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);

        NameFilm[] actual = manager.findLast();
        NameFilm[] expected = {third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void myTest2() {
        FilmsManager manager = new FilmsManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);

        NameFilm[] actual = manager.findLast();
        NameFilm[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void myTest3() {
        FilmsManager manager = new FilmsManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);

        NameFilm[] actual = manager.findLast();
        NameFilm[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void myTest4() {
        FilmsManager manager = new FilmsManager(5);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);

        NameFilm[] actual = manager.findLast();
        NameFilm[] expected = {eleventh, tenth, ninth, eighth, seventh};

        Assertions.assertArrayEquals(expected, actual);
    }
}
