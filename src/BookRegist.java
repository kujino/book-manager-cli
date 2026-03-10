package src;
import java.util.Scanner;

public class BookRegist {	
	
	public BookData registBook() {
		Scanner scanner = new Scanner(System.in);
		
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
		int registCheck = scanner.nextInt();
		
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
			
			break;
			
		
		case 2: 
			System.out.println("書籍登録をやりなおします");
			
			return registBook();
		}
		
		return new BookData(title, purchaseDate);
		
	}
}


