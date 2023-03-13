package doubleCheckLocking;

public class DatabaseConnection {

    public static DatabaseConnection databaseConnection = null;
    private DatabaseConnection() {}

    // better on performance - as locks are avoided if databaseConnection variable is not null
    // Multi-threads handled
    public static DatabaseConnection getInstance() {
        if(databaseConnection == null) {
            synchronized (databaseConnection) {
                if(databaseConnection == null) {
                    databaseConnection = new DatabaseConnection();
                }
            }
        }
        return databaseConnection;
    }
}
