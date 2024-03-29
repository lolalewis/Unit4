
package Lesson10InsertDelete;

public class Person implements Comparable {
    private String name,gender;
    private int age;
    
    public Person(String n,String g, int a){
        name = n;
        gender = g;
        age = a;       
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    
    public String toString(){
        //Bob: age 12, male
        return name+ ": age " + "," + gender;
    }

    @Override
    public int compareTo(Object t) {
        String othername = ((Person)t).getName();
        return name.compareTo(othername);
    }
}
