package personapp;

/**
 *
 * @author x15575767
 */

import java.util.ArrayList;
public class PersonApp 
{
    public static void main(String[] args) 
    {
       //declaring and creating an arraylist
       ArrayList<Person> list;
       list = new ArrayList<Person>();
       
       //creating another list, it uses the structure of the overloaded constructer
       Person p1, p2, p3;
       p1 = new Person(6, "Emma");
       p2 = new Person(7, "Warren");
       p3 = new Person(10, "Patrick");
       
       //add the created data to the list
       list.add(p1);
       list.add(p2);
       list.add(p3);
       
       //another arraylist
       ArrayList<Person> list2;
       list2 = new ArrayList<Person>();
       
       //creating another list, it uses the structure of the overloaded constructer
       //you can have user input in the () brackets
       Person n1, n2, n3;
       n1 = new Person(9, "Jack");
       n2 = new Person(8, "Bob");
       n3 = new Person(10, "Emily");
       
       //add the created data to the list
       list2.add(n1);
       list2.add(n1);
       list2.add(n3);
       
       
       //checking they're filled (not neccesary)
       System.out.println("Printing...."+list);
       
       System.out.println("Printing...."+list2);
       
       int i;
       
       //printing list1
       for(i=0; i<list.size(); i++)
       {
           //create an instance
           Person onePerson;
           
           //get the position
           onePerson = list.get(i);
           
           //print out
           System.out.println(onePerson.printPerson());
       }
       
       //printing list2
       for(i=0; i<list.size(); i++)
       {
           //create an instance
           Person onePerson;
           
           //get the position
           onePerson = list2.get(i);
           
           //print out
           System.out.println(onePerson.printPerson());
               
       }
       
       //comparison one
       for(int x = 0; x < list.size(); x++)
       {
           //create an instance
           Person comparePersonOne;
           
           //get the position
           comparePersonOne = list.get(x);
           
           //comparison two
           for(int y = 0; y < list.size(); y++)
           {
               //another instance
               Person comparePersonTwo;
               
               //get the position
               comparePersonTwo = list2.get(y);
               
               //comparing the strings in personOne and personTwo
               if(comparePersonOne.getAge() == comparePersonTwo.getAge())
               {
                   //if true
                   System.out.println("Found a match");
               }
               
               else
               {
                   //if false
                   System.out.println("No match");
               }
           }
          
       }
       
       //**arrayList uses .size and a normal array uses .length
       
       //for(int i = 0; i<list.length; i++)
       // {
       //   for(int k = 0; j<list2.length; j++)
       //   {
       //      if(list[i] == list2[j]
       
       //for the project
       
       //we could have two arrays --> taking input and creating numbers
       //compare them ---? make five for each
    }
}
