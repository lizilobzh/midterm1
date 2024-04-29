package midterm.lizi_lobzhanidze_3.task3;

public class ArchiveArtifact {
    // Class representing an artifact
    private String name;
    private String description;

    // Constructor
    public ArchiveArtifact(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // Additional methods
    public void displayDetails() {
        System.out.println("Artifact: " + name);
        System.out.println("Description: " + description);
    }
}

