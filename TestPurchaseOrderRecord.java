public class TestPurchaseOrderRecord {
    public static void main(String... args) {
	PurchaseOrderRecord p = PurchaseOrderRecord
	    .makePurchaseOrder(1,
			       1,
			       "62150",
			       "SteelSeries Sensei Pro Gaming Laser Mouse",
			       79.99f,
			       1);
	PurchaseOrderRecord p2 = PurchaseOrderRecord
	    .makePurchaseOrder(1,
			       1,
			       "62150",
			       "SteelSeries Sensei Pro Gaming Laser Mouse",
			       79.99f,
			       2);
	System.out.println(p);
	System.out.println(p2);
    }
}

			       
