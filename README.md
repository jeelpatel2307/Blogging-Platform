### Blogging Platform in Java

This is a simple implementation of a Blogging Platform in Java. It allows users to create and manage blog posts.

### Features:

- **Post Creation**: Users can create new blog posts with a title and content.
- **Post Retrieval**: Users can retrieve a post by its ID.
- **Display All Posts**: Users can view all the existing posts on the blog.

### How to Use:

1. **Create a Post**: Use the `addPost` method to add a new post to the blog.
2. **Retrieve a Post**: Use the `getPostById` method to retrieve a post by its ID.
3. **Display All Posts**: Use the `displayAllPosts` method to view all the existing posts on the blog.

### Example Usage:

```java
// Create a new blog
Blog blog = new Blog();

// Add posts
blog.addPost(new Post(1, "First Post", "This is the content of the first post."));
blog.addPost(new Post(2, "Second Post", "This is the content of the second post."));

// Retrieve a post by ID
Post post = blog.getPostById(1);

// Display all posts
blog.displayAllPosts();

```

### Note:

- This is a basic implementation intended for learning purposes. It can be extended with additional features such as post editing, deletion, and user authentication.
