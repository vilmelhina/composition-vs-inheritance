package vilhelmina.hgtask2;

public class Main {

    public static void main(String[] args) {
        
        String firstTask = "Complete higher grade task";
        String secondTask = "Cook dinner";
        
        System.out.println("-------------- INHERITANCE --------------\n");
        
        System.out.println("Instance of InheritanceDay is created...");
        InheritanceDay inheritanceDay = new InheritanceDay(2022,05,06);
        System.out.println("First task is added...");
        inheritanceDay.addTask(firstTask);
        System.out.println("Second task is added...");
        inheritanceDay.addTask(secondTask);
        System.out.println("Completion status of first task is set to true...");
        inheritanceDay.setCompleted(firstTask, true);
        System.out.println("Instance of InheritanceDay is printed...\n");
        System.out.println(inheritanceDay);
        
        
        System.out.println("\n-------------- COMPOSITION --------------\n");
        
        System.out.println("Instance of CompositionDay is created...");
        CompositionDay compositionDay = new CompositionDay(2022,05,06);
        System.out.println("First task is added...");
        compositionDay.addTask(firstTask);
        System.out.println("Second task is added...");
        compositionDay.addTask(secondTask);
        System.out.println("Completion status of first task is set to true...");
        compositionDay.setCompleted(firstTask, true);
        System.out.println("Instance of CompositionDay is printed...\n");
        System.out.println(compositionDay);
        
    }
}
