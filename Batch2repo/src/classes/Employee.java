package classes;

/**
 * Created by JPMPC-B211 on 11/10/2016.
 */
public class Employee extends Person
{
    public String department;
    public int sssid,pagibigid,employeeid;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSssid() {
        return sssid;
    }

    public void setSssid(int sssid) {
        this.sssid = sssid;
    }

    public int getPagibigid() {
        return pagibigid;
    }

    public void setPagibigid(int pagibigid) {
        this.pagibigid = pagibigid;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }
}
