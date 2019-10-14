
package de.gedoplan.seminar.java.exercise.javadoc;

public class Customer {
  private int customerNo;
  private String name;
  private String address;

  public int getCustomerNo() {
    return this.customerNo;
  }

  public void setCustomerNo(int customerNo) {
    this.customerNo = customerNo;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Customer(int customerNo, String name) {
    this(customerNo, name, null);
  }

  public Customer(int customerNo, String name, String address) {
    this.customerNo = customerNo;
    this.name = name;
    this.address = address;
  }

  @Override
  public String toString() {
    return "Customer {"
        + this.customerNo
        + ", "
        + this.name
        + ", "
        + this.address
        + "}";
  }

  public static void main(String[] args) {
    Customer c1 = new Customer(4711, "Anton");
    Customer c2 = new Customer(4812, "Berti", "Mainz");

    System.out.println("c1: " + c1.toString());
    System.out.println("c2: " + c2.toString());

    c1.setAddress("Markdorf");
    System.out.println("c1: " + c1);

    Customer[] customers = { new Customer(1111, "Hugo"),
        new Customer(2222, "Otto"),
        c1,
        c2 };

    for (Customer customer : customers) {
      System.out.println(customer);
    }
  }
}
