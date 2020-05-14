package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufatureDate;
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, Date manufatureDate) {
		super(name, price);
		this.manufatureDate = manufatureDate;
	}

	public Date getManufatureDate() {
		return manufatureDate;
	}

	public void setManufatureDate(Date manufatureDate) {
		this.manufatureDate = manufatureDate;
	}
	
	@Override
	public String priceTag() {
		return name
			+ " (used) $ "
			+ String.format("%.2f", price)
			+ " (Manufacture date: "
			+ sdf.format(manufatureDate)
			+ ")";
	}
	
}
