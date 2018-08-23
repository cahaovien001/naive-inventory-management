import java.util.*;
import java.util.Date;
import java.awt.*;

public class TestPurchaseOrder {
    public static void main(String... args) {
	PurchaseOrderRecord _p = PurchaseOrderRecord
	    .makePurchaseOrder(1, 1,
			       "62150",
			       "SteelSeries Sensei Pro Gaming Mouse",
			       79.99f,
			       1);
	ArrayList<PurchaseOrderRecord> purchaseOrderList =
	    new ArrayList<PurchaseOrderRecord>();
	purchaseOrderList.add(_p);
			
	PurchaseOrder p =
	    new PurchaseOrder(1,
			      new Date(new Date().getTime() - (7*86400000)),
			      "Amazon",
			      "UPS",
			      "Prime Shipping",
			      new Date(),
			      new ToField("Cahao Vien",
				  ToField.makeAddress("95 Judson St. Apt 1",
							      "Malden",
							      "MA",
							      "02148")),
			      new ShipToField("Cahao Vien",
				  ToField.makeAddress("95 Judson St. Apt 1",
							      "Malden",
							      "MA",
							      "02148")),
			      purchaseOrderList,
			      "Cahao Vien",
			      null,
			      1,
			      true,
			      new PageNumber(1, 1));
			     
	System.out.println(p);
    }
}
