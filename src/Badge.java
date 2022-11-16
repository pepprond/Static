import java.util.Random;

public class Badge {
    private static int  totalNumberOfEmployees=0;
    private String badgeIdCode;
    public Employee employee;

    public Badge(Employee employeeThatNeedBudge){
        Badge.keepTrackOfEmployeesNumber();
        this.employee=employeeThatNeedBudge;
        this.badgeIdCode=generateBadgeIdCode();
    }

    private static void keepTrackOfEmployeesNumber(){
        Badge.totalNumberOfEmployees++;
    }


    private String generateBadgeIdCode(){
        return "XYZ"+employee.getName()+employee.getSurname()+"XYZ";
    }
    public void showBadgeDetails(){
        System.out.println("total employee: "+Badge.totalNumberOfEmployees);
        System.out.println(employee.getEmployeeDetails());
        System.out.println("BadgeIDcode: "+this.badgeIdCode);
    }
}
