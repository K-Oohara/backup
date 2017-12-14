public class Test {
	public static void main(String[] args){
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		System.out.println("名前:" + taro.name);
		System.out.println("年齢:" + taro.age);
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 18;
		System.out.println("名前:" + hanako.name);
		System.out.println("年齢:" + hanako.age);
		
		Person ichiro = new Person();
		ichiro.name = "佐藤一郎";
		ichiro.age = 23;
		System.out.println("名前:" + ichiro.name);
		System.out.println("年齢:" + ichiro.age);
		
		Person oohara = new Person();
		oohara.name = "大原健周";
		oohara.age = 25;
		System.out.println("名前:" + oohara.name);
		System.out.println("年齢:" + oohara.age);
	}
}