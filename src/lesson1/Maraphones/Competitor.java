package lesson1.Maraphones;

/**
 * Created by i.lapshinov on 29.05.2018.
 */
public interface Competitor {
    void run (int dist);
    void sweam (int dist);
    void jump (int height);
    boolean isOnDistance();
    void info();
}
