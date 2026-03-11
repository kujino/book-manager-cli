package src;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class BookList {
	
	private List<BookData> bookList = new ArrayList<>();

	public void registBookList() {
		
		bookList.add(new BookData("全てどうでもよくなる本", LocalDate.parse("2024-05-10")));
		bookList.add(new BookData("月間よっこらせ 2024-6月号", LocalDate.parse("2024-06-12")));
		bookList.add(new BookData("誰も知らない時計の読み方", LocalDate.parse("2024-06-12")));
		bookList.add(new BookData("よくわかる紙コップ", LocalDate.parse("2024-07-01")));
		bookList.add(new BookData("小指を鍛えるとすべてうまくいく", LocalDate.parse("2024-08-22")));
		
	}
	
	public void addBook(BookData book) {
		bookList.add(book);
	}
	
	public List<BookData> getBooks() {
		return bookList;
	}

}

