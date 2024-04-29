package midterm.lizi_lobzhanidze_3.task3;

public class EducationalResource {
    // Class representing an educational resource
    private String title;
    private String content;

    // Constructor
    public EducationalResource(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    // Additional methods
    public void displayContent() {
        System.out.println("Title: " + title);
        System.out.println("Content:\n" + content);
    }
}

