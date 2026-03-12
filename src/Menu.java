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
		
			int selectedNumber = input.inputInt("書籍登録 : 1 | 書籍リスト閲覧 : 2 | 登録済み書籍削除 : 3 | サービストップに戻る：4 >");
			MenuType menuType = MenuType.fromNumber(selectedNumber);
		
			switch(menuType) {
				case REGISTER:
					bookService.registerBook();
					break;
				
				case SHOW_LIST:
					bookService.showBookList();
					break;
					
				case DELETE:
					bookService.deleteBook();
					break;
					
				case EXIT:
					continue;
			}
		}
	}

}
