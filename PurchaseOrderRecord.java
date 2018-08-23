public class PurchaseOrderRecord {
    public PurchaseOrderRecord() {}

    private PurchaseOrderRecord(int o,
				int r,
				String s,
				String d,
				float p,
				int e,
				float a) {
	Ordered = o;
	Recieived = r;
	StockNo = s;
	Description = d;
	Price = p;
	Per = e;
	Amount = a;
    }
    
    public static PurchaseOrderRecord makePurchaseOrder(int o,
					 int r,
					 String s,
					 String d,
					 float p,
					 int e) {
	return new PurchaseOrderRecord(o, r, s, d, p, e, p*e);
    }

    public int ordered() {
	return Ordered;
    }

    public int recieived() {
	return Recieived;
    }

    public String stockNo() {
	return StockNo;
    }

    public String description() {
	return Description;
    }

    public float price() {
	return Price;
    }

    public int per() {
	return Per;
    }

    public float amount() {
	return Amount;
    }
    
    public String toString() {
	StringBuilder record = new StringBuilder();

	record.append(Ordered);
	record.append(",");
	record.append(Recieived);
	record.append(",");
	record.append(StockNo);
	record.append(",");
	record.append(Description);
	record.append(",");
	record.append(Price);
	record.append(",");
	record.append(Per);
	record.append(",");
	record.append(Amount);
	record.append("\n");

	return record.toString();
	
    }

    private int Ordered;
    private int Recieived;
    private String StockNo;
    private String Description;
    private float  Price;
    private int    Per;
    private float  Amount;

}
