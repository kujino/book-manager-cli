package src;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookRegist {	
	private final Scanner scanner;

	public BookRegist(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public BookData registBook() {
		while (true) {
	        System.out.println(" ");
			System.out.println("ーーー　書籍登録　ーーー");
	        System.out.println(" ");
			System.out.print("タイトルを入力してください >");
			String title = scanner.nextLine();
		
	        System.out.println(" ");
			System.out.print("購入日を入力してください(例 : 2026-4-1) >");
			String purchaseDate = scanner.nextLine();
		
	        System.out.println(" ");
			System.out.println("入力内容を登録してよろしいですか？");
	        System.out.println(" ");
			System.out.print("登録 : 1  | 入力しなおす : 2 >");

			int registCheck;

			try {
				registCheck = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(" ");
				System.out.println("選択可能な数字を入力してください");
				System.out.println(" ");
				scanner.nextLine();
				continue;
			}
		
			switch(registCheck) {
		
			case 1:
				// 通信処理再現スリープ（笑）
				try { 
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
			
				System.out.println(" ");
				System.out.println("書籍登録が完了しました");
	            System.out.println(" ");
				System.out.println("ーーーー 登録内容 ーーーー");
				System.out.println("タイトル : " + title);
				System.out.println("購入日 : " + purchaseDate);	
				System.out.println("ーーーーーーーーーーーーー");
				System.out.println(" ");
			
				return new BookData(title, purchaseDate);
			
			case 2: 
				System.out.println("書籍登録をやりなおします");
				System.out.println(" ");
				scanner.nextLine();
				continue;

			default:
				System.out.println(" ");
				System.out.println("選択可能な数字を入力してください");
				System.out.println(" ");
				scanner.nextLine();
				continue;
			}
		}
	}
}
