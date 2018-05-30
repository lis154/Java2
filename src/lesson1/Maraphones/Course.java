package lesson1.Maraphones;

public class Course {
    Obstancle[] course = new Obstancle[3];
    String name;

    public Course(String name, Obstancle[] course) {
        this.name = name;
        this.course = course;
    }

    public void doIt(Team team)
    {
        for (Competitor c: team.getCommand())
        {
            for (Obstancle o: course)
            {
                o.doit(c);
                if (!c.isOnDistance()){
                    break;
                }
            }
        }
    }


}
