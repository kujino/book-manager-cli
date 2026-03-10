package src;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	private final Scanner scanner;
	private final BookService bookService;

	public Menu(Scanner scanner) {
		this.scanner = scanner;
		this.bookService = new BookService(scanner);
	}

	public void startMenu() {
		while(true) {
		
			System.out.println("利用したいサービスの数字を入力してください");
            System.out.println(" ");
			System.out.print("書籍登録 : 1 | 書籍リスト閲覧 : 2 | 登録済み書籍削除 : 3 >");
		
			int serviceNum;

			try {
				serviceNum = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(" ");
				System.out.println("選択可能な数字を入力してください");
				System.out.println(" ");
				scanner.nextLine();
				continue;
			}
		
			switch(serviceNum) {
				case 1:
					bookService.registerBook();
					break;
				
				case 2:
					bookService.showBookList();
					break;
					
				case 3:
					bookService.deleteBook();
					break;
			}

            System.out.println(" ");
			System.out.print("書籍登録へ進む : 1 | 書籍リスト閲覧 : 2 | 登録済み書籍削除 : 3 | サービストップに戻る : 4 >");
					
			int nextChoices;

			try {
				nextChoices = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(" ");
				System.out.println("選択可能な数字を入力してください");
				System.out.println(" ");
				scanner.nextLine();
				continue;
			}
					
			switch (nextChoices) {
				case 1:
					bookService.registerBook();
					
					break;
					
				case 2:
					bookService.showBookList();
					break;
					
				case 3:
					bookService.deleteBook();
						
				case 4:
					continue;
			}
		}
	}

}
