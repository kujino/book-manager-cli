package src;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookService {

	private BookList bookList = new BookList();
	private BookRegist bookRegist = new BookRegist();
	
    public BookService() {
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
		Scanner scanner = new Scanner(System.in);

		while(true) {
		
			System.out.println(" ");
			System.out.print("削除したい本のIDを入力してください >");

			int id;

				try {
					id = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println(" ");
					System.out.println("選択可能な数字を入力してください");
					scanner.nextLine();
					continue;
				}
		
			System.out.println(" ");
			System.out.println( "削除してよろしいですか？");

			System.out.println(" ");
			System.out.print("削除する : 1 | やめる : 2 >");

			int deleteConfirm;
			
			try {
				deleteConfirm = scanner.nextInt();
			} catch (InputMismatchException e) {
					System.out.println(" ");
					System.out.println("選択可能な数字を入力してください");
					System.out.println(" ");
					scanner.nextLine();
					continue;
				}
		
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

