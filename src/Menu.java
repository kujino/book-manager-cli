package src;

public class Menu {
	private final BookService bookService;
	private final InputHandler input;

	public Menu(InputHandler input) {
		this.input = input;
		this.bookService = new BookService(input);
	}

	public void startMenu() {
		while(true) {
		
			System.out.println("利用したいサービスの数字を入力してください");
            System.out.println(" ");
		
			int serviceNum = input.inputInt("書籍登録 : 1 | 書籍リスト閲覧 : 2 | 登録済み書籍削除 : 3 >");
		
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
			int nextChoices = input.inputInt("書籍登録へ進む : 1 | 書籍リスト閲覧 : 2 | 登録済み書籍削除 : 3 | サービストップに戻る : 4 >");
					
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
