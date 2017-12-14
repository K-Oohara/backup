
public class Person {

	//変数の設定
	public String name = null;
	public int age = 0;
	public String phoneNumber = null;
	public String address = null;


	//メソッドの追加
	public void talk(){
		System.out.println(this.name + "が話す");
	}

	public void walk(){
		System.out.println(this.name + "が歩く");
	}

	public void run(){
		System.out.println(this.name + "が走る");
	}


	//***コンストラクタの記述***
	//コンストラクタ①
	public Person(){}

	//コンストラクタ②
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	//コンストラクタ③
	public Person(String name){
		this.name = name;
		this.age = 0;
	}

	//コンストラクタ④
	public Person(int age){
		this.name = "名前なし";
		this.age = age;
	}

	//コンストラクタ⑤
	public Person(int age, String name){
		this.name = name;
		this.age = age;
	}
}
