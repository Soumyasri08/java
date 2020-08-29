public class Person {
  private String name; 
  
  public String getName() {
    return name;
  }

  
  public void setName(String newName) {
    this.name = newName;
  }
}
public class getset{
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.name = "John";  
    System.out.println(myObj.name); 
  }
}

