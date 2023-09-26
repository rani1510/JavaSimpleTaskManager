
package taskmanager;

public class Task {
    private String title;
    private String description;

    // Constructor
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // toString method for better representation
    @Override
    public String toString() {
        return "Title: " + title + "\nDescription: " + description;
    }
}
