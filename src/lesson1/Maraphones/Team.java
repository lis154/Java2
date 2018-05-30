package lesson1.Maraphones;

/**
 * Created by i.lapshinov on 30.05.2018.
 */
public class Team {
    String name;
    Competitor[] command = new Competitor[4];

    public Team(String name, Competitor[] command) {
        this.name = name;
        this.command = command;
    }

    public void infoAll()
    {
        System.out.println(name);
        for (Competitor c: command) {
            c.info();
        }
    }


}
