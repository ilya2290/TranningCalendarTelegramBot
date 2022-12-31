package trainingCalendarCoreModule.trainingCalendarOperations.exercisePerformer;

import java.time.LocalDateTime;

public abstract class ExerciseConfigurator {

    /**
     * Get an additional weight.
     */
    public abstract double getAdditionalWeight();

    /**
     * Get a current date and time.
     */
    public abstract LocalDateTime getCurrentTimeDate();

    /**
     * Get a muscle exercise.
     */
    public abstract String getMuscleExercise();

    /**
     * Get a number of repetitions.
     */
    public abstract int getNumberOfRepetitions();

    /**
     * Get a number of sets.
     */
    public abstract int getNumberOfSets();

    /**
     * Set an additional weight.
     *
     * @param additionalWeight The additional weight
     */
    public abstract void setAdditionalWeight(double additionalWeight);

    /**
     * Set a current date and time.
     */
    public abstract void setCurrentTimeDate();

    /**
     * Set an exercise for a certain muscle.
     * @param muscle an exercise for a certain muscle
     */
    public abstract void setMuscle(String muscle);

    /**
     * Set a number of repetitions.
     *
     * @param numberOfRepetitions The number of repetitions.
     */
    public abstract  void setNumberOfRepetitions(int numberOfRepetitions);

    /**
     * Set a number of sets.
     *
     * @param numberOfSets The number of sets
     *
     * return The number of sets.
     */
    public abstract void setNumberOfSets(int numberOfSets);

}
