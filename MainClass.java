import java.util.*;
import java.io.*;

public class MainClass{
	public static void main(String[] args){
		Person person = new Person();
		person.setName("Rahul");
		person.setCity("Mumbai");
		person.setAge(20);
		System.out.println(person.getName());
		System.out.println(person.getCity());
		System.out.println(person.getAge());
		try{
			Properties prop = new Properties();		
			FileInputStream fis = new FileInputStream("application.properties");
			prop.load(fis);
			System.out.println(prop.getProperty("key"));
		} catch(Excepion ex){
			ex.printStackTrace();
		}
	}
}
