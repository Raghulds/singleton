package eagerLoaded;
 // Cons: Slow start up as the DB connection will be created on app bootstrapping (compiling)
public class DatabaseConnection {
    public static DatabaseConnection databaseConnection = new DatabaseConnection();

    private DatabaseConnection() {

    }

    public static DatabaseConnection getInstance() {
        return databaseConnection;
    }
}
