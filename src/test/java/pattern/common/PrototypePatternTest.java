package pattern.common;

import prototype.Employees;

import java.util.List;

/**
 * Created by Administrator on 10/1/2015.
 */
public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        //Use the clone method to get the Employee object
        Employees empaOld = (Employees) emps.clone();
        Employees empsNew = (Employees) emps.clone();
        List<String> listOld = empaOld.getEmpList();
        listOld.add("John");
        List<String> listNew = empsNew.getEmpList();
        listNew.remove("Pankaj");

        System.out.println("emps List: " + emps.getEmpList());
        System.out.println("empaOld List: " + listOld);
        System.out.println("empsNew List: " + listNew);
    }
}
