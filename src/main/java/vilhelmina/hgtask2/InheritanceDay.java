package vilhelmina.hgtask2;

import java.util.ArrayList;
import java.util.Date;

public class InheritanceDay extends Date {
    
    ArrayList<Activity> activities;

    InheritanceDay(int year, int month, int day) {
        super(year, month, day);
        activities = new ArrayList<>();
    }
    
    void addActivity(String activityDescription) {
        activities.add(new Activity(activityDescription));
    }
    
    void setCompleted(String activityDescription, boolean completed) {
        for (Activity activity : activities) {
            if(activity.getDescription().equals(activityDescription)) {
                activity.setCompleted(completed);
            }
        }
    }

    @Override
    public String toString() {
        String result = super.toString().substring(0, 10) + "\n";
        for (Activity activity : activities) {
            result += activity + "\n";
        }
        return result;
    }
    
}
