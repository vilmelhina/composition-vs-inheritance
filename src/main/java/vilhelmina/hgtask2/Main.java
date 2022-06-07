package vilhelmina.hgtask2;

public class Main {

    public static void main(String[] args) {
        
        String firstTask = "Complete higher grade task";
        String secondTask = "Cook dinner";
        
        System.out.println("-------------- INHERITANCE --------------\n");
        
        InheritanceDay inheritanceDay = new InheritanceDay(2022,06,06);
        inheritanceDay.addTask(firstTask);
        inheritanceDay.addTask(secondTask);
        inheritanceDay.setCompleted(firstTask, true);
        System.out.println(inheritanceDay);
        
        
        System.out.println("\n-------------- COMPOSITION --------------\n");
        
        CompositionDay compositionDay = new CompositionDay(2022,06,06);
        compositionDay.addTask(firstTask);
        compositionDay.addTask(secondTask);
        compositionDay.setCompleted(firstTask, true);
        System.out.println(compositionDay);
        
    }
}
