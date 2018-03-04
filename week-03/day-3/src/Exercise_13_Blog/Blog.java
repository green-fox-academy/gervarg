package Exercise_13_Blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {

  List<BlogPost> blogPosts = new ArrayList<>();

  public void addSpecificPost(BlogPost blogPost){
    blogPosts.add(blogPost);
  }

  public void deletePost(int index){
    blogPosts.remove(index);
  }

  public void updatePost(int index, BlogPost blogPost){
    blogPosts.set(index, blogPost);
  }

  public List<BlogPost> getBlogPosts() {
    return blogPosts;
  }
  public String toString(){
    String post = "";
    for (int i = 0; i < blogPosts.size(); i++) {
      post += blogPosts.get(i) + "\n";
    }
    return post;
  }
}
