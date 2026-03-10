package src;

public class BookData {
	
	private static int idCounter = 1;

	private int id;
    private String title;
    private String purchaseDate;

    public BookData(String title, String purchaseDate) {
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

    public String getPurchaseDate() {
        return purchaseDate;
    }
}
