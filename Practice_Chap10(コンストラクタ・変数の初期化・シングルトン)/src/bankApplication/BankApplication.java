package bankApplication;

import java.util.Scanner;

public class BankApplication {
	
	// 배열 100개는 정멤버로 되어있고, 배열이므로 한계가 있다.(메모리 낭비, 정적이다)
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("1番：口座生成｜2番：口座リスト｜3番：預金｜4番：出金｜5番：終了");
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.print("選択＞ ");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				createAccount();
			} else if(choice == 2) {
				accountList();
			} else if(choice == 3) {
				deposit();
			} else if(choice == 4) {
				withdraw();
			} else if(choice == 5) {
				System.out.println("口座管理プログラムを終了します！");
				run = false;
			} else {
				System.out.println("誤って入力しました。");
			}
		}
	}

	public static void createAccount() {
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("◎口座開設を行います。");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.print("口座番号：");
		String ano = sc.next();
		
		System.out.print("口座主：");
		String owner = sc.next();
		
		System.out.print("入金額：");
		int balance = sc.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {     //처음의 어카운트 값을 설정한다.
				accountArray[i] = newAccount;  //어테치 작업(붙이는 작업) 대단히 중요!!!!!!
				System.out.println("結果：口座開設完了");
				//System.out.println(accountArray[i].getAno() + " , " + accountArray[i].getOwner() + " , " + accountArray[i].getBalace()  );
				break;
			}
		}
	}
	
	//口座リスト
	public static void accountList() {
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("★口座リスト");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < accountArray.length; i++) {
			Account account  = accountArray[i];
			//口座に対する内容が存在すると（インスタンスにデータが入っていると）
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print(" \t ");
				System.out.print(account.getOwner());
				System.out.print(" \t ");
				System.out.print(account.getBalace());
				System.out.println();
			}
		}
	}
	//預金
	public static void deposit() {
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("■預金");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.print("口座番号 入力：");
		String ano = sc.next();
		System.out.print("預金額 ：");
		int money = sc.nextInt();
		
		Account account = findAccount(ano);
		if(account == null ) {
			System.out.println("結果：口座がありません。（確認必要）");
			return;
		}
		account.setBalace(account.getBalace() + money);
		System.out.println("結果：預金成功！現在 残高：" + account.getBalace());
	}
	
	//出金
	public static void withdraw() {
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("■出金");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.print("口座番号 入力：");
		String ano = sc.next();
		System.out.print("出金額 ：");
		int money = sc.nextInt();
		
		Account account = findAccount(ano);
		if(account == null ) {
			System.out.println("結果：口座がありません。（確認必要）");
			return;
		}
		account.setBalace(account.getBalace() - money);
		System.out.println("結果：出金成功！現在 残高：" + account.getBalace());
	}
	
	//口座探し
	public static  Account findAccount(String ano) {
		Account account = null;
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				//매개변수로 넘어온 계좌번호와 동일하다면...
				if(accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}
