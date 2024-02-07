package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class com  {
	
	    public static void main(String[] args) {
	        List<Person>people=new ArrayList<>();
	        people.add(new Person("dhamu", 30));
	        people.add(new Person("divan", 25));
	        people.add(new Person("siva", 35));
	     
	        Collections.sort(people);
	        for (Person person : people) {
	            System.out.println(person);
	        }
	    }
	}

	 class Person implements Comparable<Person>{
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name=name;
	        this.age=age;
	    }

	    
	    public int compareTo(Person other ) {
	        // Compare based on age
	        return Integer.compare(this.age, other.age);
	    }

	    @Override
	    public String toString() {
	        return "Person{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                '}';
	    }
	}

	


