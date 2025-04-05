public class Main {
    public static void main(String[]args){

        IDataService apiService = new ApiDataService("API-713918");
        DataProcessor apiProcessor = new DataProcessor(apiService);
        apiProcessor.process();

        IDataService dbService = new DatabaseDataService("jdbc:mysql://localhost:3306/mydb");
        DataProcessor dbProcessor = new DataProcessor(dbService);
        dbProcessor.process();
    }
}
