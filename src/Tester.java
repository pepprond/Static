public class Tester {
    public static void main(String[] args) {
    Employee person1 =new Employee("giuseppe","rondelli","via soldato d'alessandro 13");
    Employee person2= new Employee("chiara","consiglio","via onorevole bonfiglio 44");

    Badge personBadge1 =new Badge(person1);
    Badge personBadge2 =new Badge(person2);

    personBadge1.showBadgeDetails();
    personBadge2.showBadgeDetails();

    }
}