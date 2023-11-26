package TWO;

public class Customer {
    String name;
    String address;
    public static void main(String[] args){

        Customer customer=new Customer();
        {
            String name="Smith";
            customer.name=name;
            System.out.println(customer.name);
        }
        String name="john";
        customer.name=name;
        System.out.println(customer.name);
    }
}
