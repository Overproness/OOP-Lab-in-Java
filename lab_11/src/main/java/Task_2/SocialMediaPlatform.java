package Task_2;

// Define abstract base class Content
abstract class Content {
    String content;

    // Constructor
    public Content(String content) {
        this.content = content;
    }

    // Abstract method post
    abstract void post();
}

// Concrete subclass for text content
class TextContent extends Content {
    // Constructor
    public TextContent(String content) {
        super(content);
    }

    // Implementation of post method for text content
    @Override
    void post() {
        System.out.println("Posting text: " + content);
    }
}

// Concrete subclass for image content
class ImageContent extends Content {
    // Constructor
    public ImageContent(String content) {
        super(content);
    }

    // Implementation of post method for image content
    @Override
    void post() {
        System.out.println("Uploading image: " + content);
    }
}

// Concrete subclass for video content
class VideoContent extends Content {
    // Constructor
    public VideoContent(String content) {
        super(content);
    }

    // Implementation of post method for video content
    @Override
    void post() {
        System.out.println("Streaming video: " + content);
    }
}

// Main class to demonstrate polymorphism
public class SocialMediaPlatform {
    public static void main(String[] args) {
        // Create an array of Content objects
        Content[] feed = {
            new TextContent("Hello, everyone!"),
            new ImageContent("image.jpg"),
            new VideoContent("video.mp4")
        };

        // Loop through the array and call the post method for each content
        for (Content content : feed) {
            content.post();
        }
    }
}
