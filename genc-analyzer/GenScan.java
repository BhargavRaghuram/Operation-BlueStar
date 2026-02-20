import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;



 

public class GenScan {

 

    private Set<String> dnaRecordSet = new HashSet<>();

 

    public Set<String> getDnaRecordSet() {
        return dnaRecordSet;
    }

 

    public void setDnaRecordSet(Set<String> dnaRecordSet) {
        this.dnaRecordSet = dnaRecordSet;
    }

 

    //write and implement the business requirements in this class
    public void addDNADetail(String details){
        if(details != null && !details.isEmpty())
        {
            dnaRecordSet.add(details);
        }
    }

 

    public List<String> findLowMarkerSamples(){
        List<String> lowMarkerList=new ArrayList<>();

 

        for(String record:dnaRecordSet){
            String[] parts=record.split(":");
            if(parts.length==2){
                String sampleId=parts[0];
                int markerCount=Integer.parseInt(parts[1]);
                if(markerCount < 50){
                    lowMarkerList.add(sampleId);
                }
            }
        }

 

        return lowMarkerList;
    }
}