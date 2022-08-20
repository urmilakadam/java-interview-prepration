import pojo.Address;
import pojo.Student;

public class Main {
    public static void main(String[] args) {

        Address address = new Address("Pune","Maharastra");
        System.out.println("address hashcode" + address.hashCode());

        Student student= new Student("Urmila", address);
        System.out.println(student);

        Address address1 = student.getAddress();
        address1.setCity("Gangakhed");
        System.out.println("address1 hashcode" + address1.hashCode());

        System.out.println(student);

    }
}