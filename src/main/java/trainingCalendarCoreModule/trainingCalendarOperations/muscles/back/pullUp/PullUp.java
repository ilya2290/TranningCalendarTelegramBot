package trainingCalendarCoreModule.trainingCalendarOperations.muscles.back.pullUp;

public enum PullUp { //Decompose later!!!!

    DEAD_LIFT ("Deadlift"),
    PULL_UP ("Pull up"),
    PULL_UP_WITH_WEIGH ("Pull up with a weight"),
    PULL_DOWN_BLOCK_BEHIND_HEAD ("Pull down a block behind a head"),
    PULL_DOWN_BLOCK_TO_CHEST ("Pull down block to chest");

    String name;

    PullUp(String name) {
        this.name =name;
    }

    public String getName()
    {
        return this.name;
    }
}
