package lesson1.Maraphones;

/**
 * Created by i.lapshinov on 29.05.2018.
 */
public class Human implements Competitor {


    private String name;

    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;

    boolean active;

    public Human(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println( name + " success");
        }
        else {
            System.out.println( name + " fails");
            active = false;
        }
    }

    @Override
    public void sweam(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println( name + " success");
        }
        else {
            System.out.println(name + " fails");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println( name + " success");
        }
        else {
            System.out.println(name + " fails");
            active = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println( name + " " + active);
    }
}
