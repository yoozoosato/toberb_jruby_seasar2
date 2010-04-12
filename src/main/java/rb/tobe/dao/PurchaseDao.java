package rb.tobe.dao;

import rb.tobe.entity.Purchase;
import java.util.List;

public interface PurchaseDao {

	public static final Class BEAN = Purchase.class;
	
	public int insert(Purchase purchase);
	public int update(Purchase purchase);
	public int delete(Purchase purchase);
	public List<Purchase> find();
}
