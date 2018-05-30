package lesson1.Maraphones;

/**
 * Created by i.lapshinov on 29.05.2018.
 */
public class Animal implements Competitor {

    private String type;
    private String name;

    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;

    boolean onDistance;


    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " success");
        }
        else {
            System.out.println(type + " " + name + " fails");
        onDistance = false;
        }
    }

    @Override
    public void sweam(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " success");
        }
        else {
            System.out.println(type + " " + name + " fails");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " success");
        }
        else {
            System.out.println(type + " " + name + " fails");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " " + onDistance);
    }
}
