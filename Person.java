public class Person
    {
    private String name;
    private int age;
    private String gender;
    public Person(String name,int age,String gender)
    {
    this.age=age;
    this.gender=gender;
    this.name=name;
    }
    public int getAge()
    {
    return age;
    }
    public void setAge()
    {
    this.age=age;
    }
    public String getGender()
    {
    return gender;
    }
    public void setGender()
    {
    this.gender=gender;
    }
    public String getName()
    {
    return name;
    }
    public void setName()
    {
    this.name=name;
    }
    public void display()
    {
    System.out.println("Passenger details are "+name+","+age+","+gender);
    }}