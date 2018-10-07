public class MainClass{
	public static void main(String[] args){
		Person person = new Person();
		person.setName("Rahul");
		person.setCity("Mumbai");
		person.setAge(20);
		System.out.println(person.getName());
		System.out.println(person.getCity());
		System.out.println(person.getAge());
	}
}
