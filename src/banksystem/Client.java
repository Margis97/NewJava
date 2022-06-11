package banksystem;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {

	private List<BankProduct> bankProducts;


	public Client(String firstname, String lastname, int id) {
		super(firstname, lastname, id);
		this.bankProducts = new ArrayList<>();
	}


	public void addBankProduct(BankProduct bankProduct) {
		this.bankProducts.add(bankProduct);
	}

	public void printAllProducts() {
		for(BankProduct bankProduct: bankProducts) {
			bankProduct.printInformationAboutProduct();
		}
	}
}

