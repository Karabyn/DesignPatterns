package patterns.behavioral.memento;

public class MementoDemo {

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Rodney Valerchenko");
        employee.setAddress("43 Valer Street");
        employee.setPhone("007-756-1010");

        Caretaker caretaker = new Caretaker();
        caretaker.save(employee);

        employee.setPhone("911-911-9911");

        caretaker.save(employee);

        employee.setPhone("555-555-5555");

        caretaker.revert(employee);

        System.out.println("Reverts to last save point: " + employee);

        caretaker.revert(employee);

        System.out.println("Reverted to original: " + employee);







    }
}
