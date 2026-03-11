package src;

public class BookService {

	private final BookList bookList = new BookList();
	private final BookRegist bookRegist;
	private final InputHandler input;
	
    public BookService(InputHandler input) {
		this.input = input;
    	this.bookRegist = new BookRegist(input);
        bookList.registBookList();   // ← サンプル本追加
    }
	
	public void registerBook() {
		BookData book = bookRegist.registBook();
		bookList.addBook(book);
	}
	
	public void showBookList() {

        System.out.println();
        System.out.println("（タイトル｜購入日）");

        for (BookData book : bookList.getBooks()) {
            System.out.println(book.getId() + ". " + book.getTitle() + " | " + book.getPurchaseDate() );
        }
        System.out.println(" ");
	}
	
	public void deleteBook() {
		while(true) {
		
			System.out.println(" ");
			int id = input.inputInt("削除したい本のIDを入力してください >");
		
			System.out.println(" ");
			System.out.println( "削除してよろしいですか？");

			System.out.println(" ");
			int deleteConfirm = input.inputInt("削除する : 1 | やめる : 2 >");
		
			switch(deleteConfirm) {
		
			case 1:
				// 通信処理再現スリープ（笑）
				try { 
	            	Thread.sleep(1000);
	        	} catch (InterruptedException e) {
	            	System.out.println(e);
	        	}
			
				bookList.getBooks().removeIf(book -> book.getId() == id);
				System.out.println(" ");
				System.out.println("削除しました");
				System.out.println(" ");
				return;
			
			case 2:
				System.out.println(" ");	
				System.out.println("削除処理を中止しました");
				System.out.println(" ");
				return;
			}
		}
	}
}
