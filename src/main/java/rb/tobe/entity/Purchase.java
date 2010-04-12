package rb.tobe.entity;

import java.util.Date;

public class Purchase {
	public static final String TABLE = "purchase";
	public static final String id_COLMUN = "ID";
	public static final String businessDate_COLUMN = "BUSINESS_DATE";
	public static final String transactionCode_COLUMN = "TRANSACTION_CODE";
	public static final String itemName_COLUMN = "ITEM_NAME";
	public static final String price_COLUMN = "PRICE";
	public static final String createdAt_COLUMN = "CREATED_AT";
	public static final String updatedAt_COLUMN = "UPDATED_AT";
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private Date businessDate;
	private String transactionCode;
	private String itemName;
	private double price;
	private Date createdAt;
	private Date updatedAt; 

	public Date getBusinessDate() {
		return businessDate;
	}
	public void setBusinessDate(Date businessDate) {
		this.businessDate = businessDate;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
