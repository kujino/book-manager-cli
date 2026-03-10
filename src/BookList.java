package src;
import java.util.ArrayList;
import java.util.List;

public class BookList {
	
	private List<BookData> bookList = new ArrayList<>();

	public void registBookList() {
		
		bookList.add(new BookData("全てどうでもよくなる本", "2024-5-10"));
		bookList.add(new BookData("月間よっこらせ 2024-6月号", "2024-6-12"));
		bookList.add(new BookData("誰も知らない時計の読み方", "2024-6-12"));
		bookList.add(new BookData("よくわかる紙コップ", "2024-2-24-7-1"));
		bookList.add(new BookData("小指を鍛えるとすべてうまくいく", "2024-8-22"));
		
	}
	
	public void addBook(BookData book) {
		bookList.add(book);
	}
	
	public List<BookData> getBooks() {
		return bookList;
	}

}

