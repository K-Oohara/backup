package com.human;

public class HumanName {
	public String sei;
	private String mei;

	public HumanName(){
		//コンストラクタ
		//インスタンス化したとき最初に実行される
		sei = "大原";
		mei = "健周";
	}

	public HumanName(String sei, String mei){
		//コンストラクタ()内の赤文字が引数（ひきすう）
		this.sei = sei;
		this.mei = mei;
		//thisはこのクラスのフィールドに宣言された変数
		//引数のseiとフィールド変数のseiを区別する
	}

	public String getName(){
		return sei + mei;
	}

	public void setName(String a){
		mei = a;
	}

	public String getMei(){
		return mei;
	}

}
