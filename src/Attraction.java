
import java.util.ArrayList;

public abstract class Attraction {
    private String name;
    private String identifier;
    private ArrayList<Visitor> waitingLine;
    private int maxBatchSize;
    private ArrayList<Visitor> servedHistory;
    private Staff operator;

    public Attraction(String name, String identifier, int maxBatchSize){
        this.name = name;
        this.identifier = identifier;
        this.waitingLine = new ArrayList<>();
        this.maxBatchSize = maxBatchSize;
        this.servedHistory = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public String getIdentifier(){
        return identifier;
    }

    public int getMaxBatchSize(){
        return maxBatchSize;
    }

    public Staff getOperator(){
        return operator;
    }

    public void setOperator(Staff operator){
        this.operator = operator;
    }
}
