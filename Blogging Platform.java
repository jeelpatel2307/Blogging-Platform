import java.util.ArrayList;
import java.util.List;

class Post {
    private int id;
    private String title;
    private String content;

    public Post(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}

class Blog {
    private List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public Post getPostById(int id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public void displayAllPosts() {
        for (Post post : posts) {
            System.out.println("Post ID: " + post.getId());
            System.out.println("Title: " + post.getTitle());
            System.out.println("Content: " + post.getContent());
            System.out.println("---------------------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Blog blog = new Blog();

        // Adding posts
        blog.addPost(new Post(1, "First Post", "This is the content of the first post."));
        blog.addPost(new Post(2, "Second Post", "This is the content of the second post."));
        blog.addPost(new Post(3, "Third Post", "This is the content of the third post."));

        // Displaying all posts
        System.out.println("All Posts:");
        blog.displayAllPosts();

        // Retrieving a post by ID
        int postId = 2;
        System.out.println("\nRetrieving Post with ID " + postId + ":");
        Post retrievedPost = blog.getPostById(postId);
        if (retrievedPost != null) {
            System.out.println("Title: " + retrievedPost.getTitle());
            System.out.println("Content: " + retrievedPost.getContent());
        } else {
            System.out.println("Post not found.");
        }
    }
}
