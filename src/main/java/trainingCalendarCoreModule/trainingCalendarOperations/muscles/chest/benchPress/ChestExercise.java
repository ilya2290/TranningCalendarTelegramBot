package trainingCalendarCoreModule.trainingCalendarOperations.muscles.chest.benchPress;

public enum ChestExercise {

    BENCH_PRESS_EXERCISE ("Bench press exercise"),
    BENCH_PRESS_EXERCISE_SLOW_AND_PAUSE ("Bench press exercise: slow + pause"),
    DUMBELL_PRESS ("Dumball press");

    String name;

    ChestExercise(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}
