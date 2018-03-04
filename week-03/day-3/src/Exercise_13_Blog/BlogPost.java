package Exercise_13_Blog;

public class BlogPost {
  private String authorName;
  private String title;
  private String text;
  private String publicationDate;

  public BlogPost(String authorname, String title, String text, String publicationDate) {
    this.authorName = authorname;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }

  public String toString() {
    return "BlogPost{" +
            "authorName='" + authorName + '\'' +
            ", title='" + title + '\'' +
            ", text='" + text + '\'' +
            ", publicationDate='" + publicationDate + '\'' +
            '}';
  }

}
