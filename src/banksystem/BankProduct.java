package banksystem;

public abstract class BankProduct {

	private int id;
	private String title;
	private int amount;


	public BankProduct(int id, String title, int amount) {
		this.id = id;
		this.title = title;
		this.amount = amount;
	}

	public void printInformationAboutProduct() {
		System.out.println(id + "  " + title + " " + amount);
	}


}
