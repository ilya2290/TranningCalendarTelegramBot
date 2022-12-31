package trainingCalendarCoreModule.dataBaseConnection;

import java.sql.*;

public class DataBaseConnection {

    private final String URL = "jdbc:mysql://localhost:3306/trainingresults";
    private final String USERNAME = "root";
    private final String PASSWORD = "2290fuck";
    Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

    public String getURL() {
        return URL;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }



    Statement statement = connection.createStatement();

    public DataBaseConnection() throws SQLException {
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void isClosed(Connection connection) throws SQLException {
        if(connection.isClosed())
        {
            System.out.println("DB connection is closed.");
        }
        else System.out.println("DB connection is open");
    }

}
