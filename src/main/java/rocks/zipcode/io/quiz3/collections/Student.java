package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private List<Lab> labList = new ArrayList<>();

    public Student() {
    }

    public Student(List<Lab> labs) {
        this.labList = labs;
    }

    public Lab getLab(String labName) {

        for (Lab l : labList) {
            if (l.getName().equals(labName)) {
                return l;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if (getLab(labName) == null){
            throw new UnsupportedOperationException();
        }
         getLab(labName).setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        labList.add(lab);
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {

        return getLab(labName).getStatus() ;
    }

    @Override
    public String toString (){
        String labString = "";
        for (int i = labList.size()-1 ; i >= 0 ; i --){
            labString += labList.get(i).getName() + " > " + labList.get(i).getStatus() + "\n";
        }
        return labString.trim();
    }
}
