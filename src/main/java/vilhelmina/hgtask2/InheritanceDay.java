package vilhelmina.hgtask2;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents an day, with a list of to-do tasks. Using inheritance.
 */
public class InheritanceDay extends Date {
    
    private ArrayList<Task> tasks;

    /**
     * Creates an instance representing a day
     * @param year the year
     * @param month the month
     * @param day the day
     */
    InheritanceDay(int year, int month, int day) {
        super(year, month, day);
        tasks = new ArrayList<>();
    }
    
    /**
     * Adds a task to the day.
     * @param taskDescription the description of the task to be added
     */
    void addTask(String activityDescription) {
        tasks.add(new Task(activityDescription));
    }
    
    /**
     * Sets the completion status of a task
     * @param taskDescription the name of the task to set the status of
     * @param completed the status
     */
    void setCompleted(String taskDescription, boolean completed) {
        for (Task task : tasks) {
            if(task.getDescription().equals(taskDescription)) {
                task.setCompleted(completed);
            }
        }
    }

    /**
     * Formats the day with the tasks as a string.
     * @return the string representing the day and its tasks
     */
    @Override
    public String toString() {
        String result = super.toString().substring(0, 10) + "\n";
        for (Task task : tasks) {
            result += task + "\n";
        }
        return result;
    }
    
}
