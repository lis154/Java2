package lesson1.Maraphones;

/**
 * Created by i.lapshinov on 29.05.2018.
 */
public class MainMaraphone {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("bob", 200,3, 10), new Cat("Vaska", 200,20,3), new Dog("Bobik", 100,20,30)};
        Obstancle[] course = {new Wall(5), new Water(10), new Cross(100)};

        Team team1 = new Team("command1", competitors);
        Course course1 = new Course("cource1", course);
        course1.doIt(team1);
        team1.showResults();
        team1.infoAll();
    }
}
