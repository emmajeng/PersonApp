package personapp;

/**
 *
 * @author x15575767
 */
public class Person 
{
    //variables
    private int age;
    private String name;
    
    //constructer
    public Person()
    {
        age = 0;
        name = "";
    }

    //overloaded constructer (helps us when we add data)
    public Person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    //sets
    public void setAge(int age) 
    {
        this.age = age;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    //gets
    public int getAge() 
    {
        return age;
    }

    public String getName() 
    {
        return name;
    }
    
    //print details
    public String printPerson()
    {
        return(name+"\n");
    }
    
    
    
          
}
