import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    PostIt orange = new PostIt("orange", "Idea 1", "blue");
    PostIt pink = new PostIt("pink", "Awesome", "black");
    PostIt yellow = new PostIt("yellow", "Superb!", "green");

    BlogPost latin = new BlogPost("John Doe", "Lorem ipsum", "Lorem ipsum dolor sit amet.",
            "2000.05.04.");
    BlogPost  waitButWhy = new BlogPost("Tim Urban", "Wait but why",
            "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
    BlogPost engineerToIBM = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump",
            "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
                    "When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t " +
                    "really into the whole organizer profile thing.", "2017.03.28.");
    Animal frog = new Animal();
    frog.eat();
    System.out.println(frog);
    frog.drink();
    System.out.println(frog);
    frog.play();
    System.out.println(frog);

    Sharpie sharp1 = new Sharpie("red", 55);
    sharp1.use();
    System.out.println(sharp1);

    Student leslie = new Student("Leslie");
    Teacher marin = new Teacher("Marin");
    leslie.learn();
    leslie.question(marin);
    marin.answer();
    marin.teach(leslie);

    Station shell = new Station(1000);
    Car ferrari = new Car(10, 120);
    shell.refill(ferrari);
    System.out.println(shell.toString()+"\n"+ferrari.toString());

    List<Sharpie> sharpieList = new ArrayList<>();
    SharpieSet theActualList = new SharpieSet();

    Sharpie sharp2 = new Sharpie("brown", 67, 100);
    Sharpie sharp3 = new Sharpie("purple", 45, 34);
    sharpieList.add(sharp1);
    sharpieList.add(sharp3);
    sharpieList.add(sharp2);
    sharpieList.add(sharp1);
    sharpieList.add(sharp2);



    System.out.println("The size of the sharpies is " + sharpieList.size());
    System.out.println("Number of sharpies with inkamount: " + theActualList.countUsable(sharpieList));
    System.out.println("Number of sharpies after removal: " + theActualList.removeTrash(sharpieList).size());


  }
}
