public class DataProcessor {
    private final IDataService idataService;

    public DataProcessor(IDataService iDataService){
        this.idataService = iDataService;
    }

    public void process() {
        String data = idataService.fetchData();
        System.out.println("Processing: " + data);
    }
}
