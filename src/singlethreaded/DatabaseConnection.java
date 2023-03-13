package singlethreaded;

public class DatabaseConnection {
    public static DatabaseConnection databaseConnectionObject = null;
    private DatabaseConnection() {
        databaseConnectionObject = new DatabaseConnection();
    }
    // Doesn't work on Multithreaded machine as multiple threads can create multiple DatabaseConnection objects in run time
    public static DatabaseConnection getInstance() {
        return databaseConnectionObject;
    }

}
