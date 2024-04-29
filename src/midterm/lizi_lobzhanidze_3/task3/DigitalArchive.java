package midterm.lizi_lobzhanidze_3.task3;

import java.util.ArrayList;
import java.util.List;

public class DigitalArchive {
    // Class representing the digital archive system
    private List<ArchiveArtifact> artifacts;

    // Constructor
    public DigitalArchive() {
        this.artifacts = new ArrayList<>();
    }

    // Method to add artifact to the digital archive
    public void addArtifact(ArchiveArtifact artifact) {
        artifacts.add(artifact);
    }

    // Method to retrieve artifact by name
    public ArchiveArtifact getArtifact(String name) {
        for (ArchiveArtifact artifact : artifacts) {
            if (artifact.getName().equals(name)) {
                return artifact;
            }
        }
        return null;
    }

    // Method to display all artifacts in the archive
    public void displayAllArtifacts() {
        System.out.println("Artifacts in the Digital Archive:");
        for (ArchiveArtifact artifact : artifacts) {
            artifact.displayDetails();
            System.out.println();
        }
    }
}