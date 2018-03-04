package Exercise_13_Blog;

public class Main {
  public static void main(String[] args) {
    BlogPost latin = new BlogPost("John Doe", "Lorem ipsum", "Lorem ipsum dolor sit amet.",
            "2000.05.04.");
    BlogPost waitButWhy = new BlogPost("Tim Urban", "Wait but why",
            "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
    BlogPost engineerToIBM = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump",
            "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
                    "When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t " +
                    "really into the whole organizer profile thing.", "2017.03.28.");

    Blog howStuffWorks = new Blog();
    howStuffWorks.addSpecificPost(latin);
    howStuffWorks.addSpecificPost(waitButWhy);
    howStuffWorks.addSpecificPost(engineerToIBM);

    System.out.println(howStuffWorks.getBlogPosts().get(1));
    System.out.println(howStuffWorks.getBlogPosts().size());
    howStuffWorks.deletePost(1);
    System.out.println(howStuffWorks.getBlogPosts().get(1));
    System.out.println(howStuffWorks.getBlogPosts().size());
    howStuffWorks.updatePost(1,latin);
    System.out.println(howStuffWorks.getBlogPosts().get(1));


  }
}
