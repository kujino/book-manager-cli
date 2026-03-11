package src;

import java.time.LocalDate;

public class BookData {
	
	private static int idCounter = 1;

	private int id;
    private String title;
    private LocalDate purchaseDate;

    public BookData(String title, LocalDate purchaseDate) {
        this.id = idCounter++;
        this.title = title;
        this.purchaseDate = purchaseDate;
    }
    
    public int getId()  {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }
}
