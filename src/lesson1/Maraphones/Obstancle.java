package lesson1.Maraphones;

/**
 * Created by i.lapshinov on 29.05.2018.
 */
public abstract class Obstancle {
    public abstract void doit(Competitor competitor);
}

class Wall extends Obstancle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doit(Competitor competitor) {
        competitor.jump(height);
    }
}

class Water extends Obstancle {

    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doit(Competitor competitor) {
        competitor.sweam(length);
    }
}

class Cross extends Obstancle {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doit(Competitor competitor) {
        competitor.sweam(length);
    }
}