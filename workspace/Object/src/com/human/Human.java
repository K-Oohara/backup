package com.human;

public class Human {

	public static String sei;
	public static String mei;

	public static void main(String[] args) {
//		System.out.println("Hello World");
		sei = "大原";
		mei = "健周";
		System.out.println(sei + mei);
		HumanName humanName = new HumanName();


//		System.out.println(humanName.sei);
//		System.out.println(humanName.mei);
//		humanName.setName("aaa");
		System.out.println(humanName.getName());

		String sei1 = humanName.sei;
		String mei1 = humanName.getMei();

		HumanName humanName2 = new HumanName("田中","あいう");
		System.out.println(humanName2.getName());

	}

}
