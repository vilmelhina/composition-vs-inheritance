package vilhelmina.hgtask2;

/**
 * Represents a task.
 */
public class Task {
    
    private String description;
    private boolean completed;

    /**
     * Creates a new instance of a task
     * @param description the description of the task
     */
    Task(String description) {
        this.description = description;
        this.completed = false;
    }

    /**
     * Sets if the task is completed or not
     * @param completed true if the task is completed, false if not
     */
    void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /**
     * Sets the description of the task
     * @param description the description
     */
    void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the description of the task
     * @return the description of the task
     */
    String getDescription() {
        return description;
    }
    
    /**
     * Gets the completed status of the task
     * @return the completed status of the task
     */
    boolean getCompleted() {
        return completed;
    }

    /**
     * Returns the task as a string.
     * @return the string representing the task
     */
    @Override
    public String toString() {
        String result = "* " + description + " - ";
        if(completed) {
            result += "COMPLETE";
        }
        else {
            result += "INCOMPLETE";
        }
        return result;
    }
    
}
