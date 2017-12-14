/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Person taro = new Person();
//		taro.name = "tarossss";
//		taro.age = 20;
//		taro.phoneNumber = "123-4567-8901";
//		taro.address = "123-4567";
//		System.out.println(taro.name);
//		System.out.println(taro.age);
//		System.out.println(taro.phoneNumber);
//		System.out.println(taro.address);
//		taro.talk();
//		taro.walk();
//		taro.run();
//		System.out.println();

		//コンストラクタ③を使ってインスタンス化
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		//コンストラクタ④を使ってインスタンス化
		Person shiro = new Person(25);
		System.out.println(shiro.name);
		System.out.println(shiro.age);

		//コンストラクタ⑤を使ってインスタンス化
		Person hanako =new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);


//		Person jiro = new Person();
//		jiro.name = "jirojiro";
//		jiro.age = 18;
//		System.out.println(jiro.name);
//		System.out.println(jiro.age);
//		Person hanako = new Person();
//		hanako.name = "hana--";
//		hanako.age = 16;
//		System.out.println(hanako.name);
//		System.out.println(hanako.age);

		//Robotクラスのインスタンス化練習
//		Robot robot01 = new Robot();
//		robot01.name = "rooooooboooooot";
//		System.out.println(robot01.name);
//		robot01.talk();
//		robot01.walk();
//		robot01.run();
	}

}
