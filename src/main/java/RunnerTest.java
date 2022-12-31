import trainingCalendarCoreModule.dataBaseConnection.DataBaseConnection;
import trainingCalendarCoreModule.trainingCalendarOperations.exercisePerformer.ExercisePerformer;
import trainingCalendarCoreModule.trainingCalendarOperations.exerciseTracker.ExerciseTracker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class RunnerTest {


    public static String insertSQL(LocalDateTime currentTime, int numberOfSets, int numberOfRepetitions, double additionalWeight) {
        String request = "INSERT INTO trainingresults.benchpressresults(id,trainingDateTime,numberOfSets,numberOfRepetitions,cheatingRepetitions,additionalWeight) VALUES(NULL,";

        request = request + "'2004-05-23T14:25:10'" + "," + numberOfSets + "," + numberOfRepetitions + "," + "0" + "," +  additionalWeight + ");";

        return  request;
    }

    public static void main(String[] args) throws SQLException {

        //DB connection
        DataBaseConnection dataBaseConnection = new DataBaseConnection();

        //Connection path (where to connect). Get connection.
        Connection connection = DriverManager.getConnection(dataBaseConnection.getURL(), dataBaseConnection.getUSERNAME(), dataBaseConnection.getPASSWORD());

        // Set connection to a db.
        dataBaseConnection.setConnection(connection);

        // Check db connection
        dataBaseConnection.isClosed(connection);

        // Create statement object for the performing SQL scripts
        Statement statement = connection.createStatement();

        // Class data for exercises
        ExercisePerformer performer = new ExercisePerformer();

        // Class tracker for exercises
        ExerciseTracker exerciseTracker = new ExerciseTracker();

        // Set all the training data 1 exercise! // must be TG!!!
        performer.setAllData();

        // Track all the results
        exerciseTracker.setExerciseResult(performer.getMuscleExercise(), performer.getExerciseData());

        // Print all the data (input data)
        exerciseTracker.printResults(performer.getMuscleExercise());

        // Set to the string SQL scripts that go to the statement object
        String lastREQ = insertSQL(performer.getCurrentTimeDate(),
                performer.getNumberOfSets(),
                performer.getNumberOfRepetitions(),
                performer.getAdditionalWeight());


        boolean sql2 = statement.execute(lastREQ);

        if(!sql2)
        System.out.println("Script Success!");

    }

}
