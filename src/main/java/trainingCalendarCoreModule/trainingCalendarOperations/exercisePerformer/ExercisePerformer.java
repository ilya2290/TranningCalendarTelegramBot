package trainingCalendarCoreModule.trainingCalendarOperations.exercisePerformer;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ExercisePerformer extends ExerciseConfigurator {

    private int numberOfSets;
    private double additionalWeight;
    private int numberOfRepetitions;
    private LocalDateTime date;
    private  String muscle;
    private Object[] array;

    /**
     * Get an additional weight.
     *
     * return The additional weight
     */
    @Override
    public double getAdditionalWeight() {
        return additionalWeight;
    }

    /**
     * Get a current date and time.
     *
     * return a current date and time
     */
    @Override
    public LocalDateTime getCurrentTimeDate() {
        return this.date;
    }

    /**
     * Get an exercise for a certain muscle.
     *
     * return an exercise for a certain muscle
     */
    @Override
    public String getMuscleExercise()
    {
        return this.muscle;
    }

    /**
     * Get a number of repetitions.
     *
     * return a number of repetitions.
     */
    @Override
    public int getNumberOfRepetitions() {
        return numberOfRepetitions;
    }

    /**
     * Get a number of sets.
     *
     * return a number of sets.
     */
    @Override
    public int getNumberOfSets() {
        return numberOfSets;
    }

    /**
     * Set an additional weight.
     *
     * @param additionalWeight The additional weight
     */
    @Override
    public void setAdditionalWeight(double additionalWeight) {
        this.additionalWeight = additionalWeight;
    }

    /**
     * Set a current date and time.
     */
    @Override
    public void setCurrentTimeDate() {
        this.date = LocalDateTime.now();
    }

    /**
     * Set an exercise for a certain muscle.
     *
     * @param muscle an exercise for a certain muscle
     */
    @Override
    public void setMuscle(String muscle)
    {
        this.muscle = muscle;
    }

    /**
     * Set a number of repetitions.
     *
     * @param numberOfRepetitions The number of repetitions.
     */
    @Override
    public void setNumberOfRepetitions(int numberOfRepetitions) {
        this.numberOfRepetitions = numberOfRepetitions;
    }

    /**
     * Set a number of sets.
     *
     * @param numberOfSets The number of sets
     *
     * return The number of sets.
     */
    @Override
    public void setNumberOfSets(int numberOfSets) {
        this.numberOfSets = numberOfSets;
    }

    /***********************************************************************/
            //This var will go to the Tracker class

    public Object[] getExerciseData()
    {
        return this.array;
    }

// private and inline
    public void setExerciseData(LocalDateTime currentTime, int numberOfSets, int numberOfRepetitions, double additionalWeight)
    {
        Object[] array = new Object[4];
        array[0] = currentTime;
        array[1] = numberOfSets;
        array[2] = numberOfRepetitions;
        array[3] = additionalWeight;

        this.array = array;
    }


/********************************************************/
//Emulated telegram input
    public void setAllData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Muscle: ");
        this.setMuscle(scanner.nextLine());
        System.out.println("SETS: ");
        this.setNumberOfSets(scanner.nextInt());
        System.out.println("Repetitions: ");
        this.setNumberOfRepetitions(scanner.nextInt());
        System.out.println("Weight: ");
        this.setAdditionalWeight(scanner.nextDouble());

        this.setCurrentTimeDate();

        this.setExerciseData(this.getCurrentTimeDate(), this.numberOfSets, this.getNumberOfRepetitions(), this.getAdditionalWeight());

    }
}
