package lesson1.Maraphones;

/**
 * Created by i.lapshinov on 29.05.2018.
 */
public class MainMaraphone {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("bob", 200,3, 10), new Cat("Vaska", 200,20,3), new Dog("Bobik", 100,20,30)};
        Obstancle[] course = {new Wall(5), new Water(10), new Cross(100)};

        for (Competitor c: competitors)
        {
            for (Obstancle o: course)
            {
                o.doit(c);
                if (!c.isOnDistance()){
                    break;
                }
            }
        }
        for (Competitor c: competitors)
        {
            c.info();
        }
    }
}
