public class ApiDataService implements IDataService {
    private String apiKey;

    public ApiDataService(String apiKey){
        this.apiKey = apiKey;
    }

    @Override
    public String fetchData(){
        return "Data fetched from API using key: " + apiKey;
    }
}
