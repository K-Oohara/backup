
public class Test {

	public static void main(String[] args) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "000-0000-0000";
		taro.address = "111-2222";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		Robot aibo = new Robot();
		aibo.name = "aibo";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();
		Robot asimo = new Robot();
		asimo.name = "asimo";
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();
		Robot pepper = new Robot();
		pepper.name = "pepper";
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();
		Robot doraemon = new Robot();
		doraemon.name = "doraemon";
		System.out.println(doraemon.name);
		doraemon.talk();
		doraemon.walk();
		doraemon.run();
//		Person jiro = new Person();
//		jiro.name = "木村次郎";
//		jiro.age = 18;
//		jiro.phoneNumber = "111-2222-3333";
//		jiro.address = "123-4567";
//		System.out.println(jiro.name);
//		System.out.println(jiro.age);
//		System.out.println(jiro.phoneNumber);
//		System.out.println(jiro.address);
//		Person hanako = new Person();
//		hanako.name = "鈴木花子";
//		hanako.age = 16;
//		hanako.phoneNumber = "080-0147-8523";
//		hanako.address = "123-7895";
//		System.out.println(hanako.name);
//		System.out.println(hanako.age);
//		System.out.println(hanako.phoneNumber);
//		System.out.println(hanako.address);
//		Person kenshu = new Person();
//		kenshu.name = "大原健周";
//		kenshu.age = 25;
//		kenshu.phoneNumber = "xxx-xxxx-xxxx";
//		kenshu.address = "xxx-xxxx";
//		System.out.println(kenshu.name);
//		System.out.println(kenshu.age);
//		System.out.println(kenshu.phoneNumber);
//		System.out.println(kenshu.address);

	}
}
