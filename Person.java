class Main{
    public static void main(String args[]){
    Person p = new Person();
    p.setName("Sibtain Alam");
    p.setAge(28);
    p.setAddress("Garden reach");

    System.out.println("Name: " + p.getName());
    }
}
class Person{
    private String name;
    private int age;
    private String address;

    //getter method
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }
    //setter method
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
}