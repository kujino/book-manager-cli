import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		BookService bookService = new BookService();
		
		while(true) {
		
			System.out.println("利用したいサービスの数字を入力してください");
            System.out.println(" ");
			System.out.print("書籍登録 : 1 | 書籍リスト閲覧 : 2 | 登録済み書籍削除 : 3 >");
		
			int serviceNum = scanner.nextInt();
		
			switch(serviceNum) {
				case 1:
					bookService.registerBook();
					break;
				
				case 2:
					bookService.showBookList();
					break;
					
				case 3:
					bookService.deleteBook();
			}

			System.out.println("利用したいサービスの数字を入力してください");
            System.out.println(" ");
			System.out.print("書籍登録へ進む : 1 | 書籍リスト閲覧 : 2 | 登録済み書籍削除 : 3 | サービストップに戻る : 4 >");
					
			int nextChoices = scanner.nextInt();
					
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

