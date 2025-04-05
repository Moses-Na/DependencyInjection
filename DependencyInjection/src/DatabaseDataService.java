public class DatabaseDataService implements IDataService{
    private String dbConnectionString;

    public DatabaseDataService(String dbConnectionString) {
        this.dbConnectionString = dbConnectionString;
    }

    @Override
    public String fetchData() {
        return "Data fetched from Database with connection: " +dbConnectionString;
    }
}
