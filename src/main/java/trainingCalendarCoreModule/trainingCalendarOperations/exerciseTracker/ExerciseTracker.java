package trainingCalendarCoreModule.trainingCalendarOperations.exerciseTracker;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExerciseTracker {

    private Map<String, Object[]> exerciseResult;

    public ExerciseTracker()
    {
        this.exerciseResult = new LinkedHashMap<>();
    }



//bidlo vvod 2
    public void train(int repa)
    {
        int set = 1;
        for (int i=0; i<repa; i++)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println('\n' +"Set: "+set);
            System.out.print("Rep ");
            int rep = scanner.nextInt();

            System.out.print("Weight ");
            int weight = scanner.nextInt();

            System.out.println(set + " " + " " +  rep + " " + weight);

            set++;
        }
    }


    public void setExerciseResult(String muscle, Object[] arrayOfValues)
    {
        this.exerciseResult.put(muscle, arrayOfValues);
    }



    public Map<String, Object[]> getExerciseResult()
    {
        return this.exerciseResult;
    }

    public void printResults(String muscle){
        Map<String, Object[]> exerciseResult = this.getExerciseResult();

        for (Map.Entry<String, Object[]> mapToEnter : exerciseResult.entrySet())
        {
            // Cast to Object[] map value
            Object[] obj = mapToEnter.getValue();

            System.out.println(mapToEnter.getKey() + " " + Arrays.toString(obj));
        }
    }

}

