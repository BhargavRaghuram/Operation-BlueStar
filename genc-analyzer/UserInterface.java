import java.util.*;
import java.util.Scanner;
import java.util.Set;
import java.util.List;

class GenScan {

 

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

 

public class UserInterface {

 

    public static void main(String[] args) {

 

        Scanner sc = new Scanner(System.in);

 

        GenScan genScan = new GenScan();

 

        System.out.println("Enter the number of details");

 

        int n = Integer.parseInt(sc.nextLine());

 

        System.out.println("Enter the details (sampleId:markerCount)");

 

        for(int i = 0; i < n; i++) {

 

            String details = sc.nextLine();

 

            genScan.addDNADetail(details);

 

        }

 

        List<String> result = genScan.findLowMarkerSamples();

 

        if(result.isEmpty()) {

 

            System.out.println("No Sample Ids were found");

 

        } else {

 

            System.out.println("Sample Ids based on the condition are");

 

            for(String id : result) {

 

                System.out.println(id);

 

            }

 

        }

 

        sc.close();

 

    }

 

}