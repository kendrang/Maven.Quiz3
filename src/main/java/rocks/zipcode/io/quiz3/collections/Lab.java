package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String labName;
    LabStatus labstatus;


    public Lab() {
    }

    public Lab(String labName) {
        this.labName = labName;
        this.labstatus = LabStatus.INCOMPLETE;
    }

    public String getName() {
        return labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.labstatus = labStatus;

    }

    public LabStatus getStatus() {
        return labstatus;
    }
}
