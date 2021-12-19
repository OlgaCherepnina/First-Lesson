package lesson13;

public class Employee {
    private String name;
    private Integer personnelNumber;
    private Integer workAge;

    public Employee(String name, Integer personnelNumber, Integer workAge) {
        this.name = name;
        this.personnelNumber = personnelNumber;
        this.workAge = workAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(Integer personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public Integer getWorkAge() {
        return workAge;
    }

    public void setWorkAge(Integer workAge) {
        this.workAge = workAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", personnelNumber=" + personnelNumber +
                ", workAge=" + workAge +
                '}';
    }
}
