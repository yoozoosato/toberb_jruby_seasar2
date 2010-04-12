package rb.tobe.dao;

import java.util.List;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;

import rb.tobe.entity.Purchase;
import junit.framework.TestCase;

public class PurchaseDAOTest extends TestCase {

	public PurchaseDAOTest() {
		super();
	}
	

	public void testInsert() {
		S2Container container = S2ContainerFactory.create( "Purchase.dicon" );
		assertNotNull(container);
		container.init();
		// DAOオブジェクトの取得
		PurchaseDao dao = (PurchaseDao)container.getComponent( PurchaseDao.class );
		// 追加するカテゴリ
		Purchase p = new Purchase();
		p.setItemName("Beer");
		int i = dao.insert(p);
		container.destroy();
		assertEquals(1, i);
	}
}
		
		
