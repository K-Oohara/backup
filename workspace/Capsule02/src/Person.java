
public class Person {
	private String name = null;
	private int age = 0;

	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}

	//***カプセル化***
	//名前
	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}
	//年齢
	public int getAge(){
		return this.age;
	}

	public void setAge(int age){
		this.age = age;
	}
}
