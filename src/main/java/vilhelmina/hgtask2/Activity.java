package vilhelmina.hgtask2;

public class Activity {
    
    String description;
    boolean completed;

    Activity(String description) {
        this.description = description;
        this.completed = false;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    public boolean getCompleted() {
        return completed;
    }

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
