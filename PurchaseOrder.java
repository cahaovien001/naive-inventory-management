import java.util.Date;
import java.util.ArrayList;
import java.awt.Image;

public class PurchaseOrder {
    public PurchaseOrder(long n,
			 Date d,
			 String f,
			 String v,
			 String t,
			 Date r,
			 ToField o,
			 ShipToField h,
			 ArrayList<PurchaseOrderRecord> p,
			 String b,
			 Image l,
			 long i,
			 boolean g,
			 PageNumber m) {
	No                       = n;
	Date                     = d;
	FOB                      = f;
	VIA                      = v;
	Terms                    = t;
	DateRequired             = r;
	To                       = o;
	ShipTo                   = h;
	PurchaseOrderRecordTable = p;
	OrderedBy                = b;
	Logo                     = l;
	SlipNo                   = i;
	isOriginal               = g;
	PageNo                   = m;
    }

    public String toString() {
	StringBuilder order = new StringBuilder();

	order.append("No.: ");
	order.append(No);
	order.append(" ");
	order.append("Date: ");
	order.append(Date.toString());
	order.append("\n");
	order.append("FOB: ");
	order.append(FOB);
	order.append(" ");
	order.append("VIA: ");
	order.append(VIA);
	order.append("\n");
	order.append("Terms: ");
	order.append(Terms);
	order.append(" ");
	order.append("Date Required: ");
	order.append(DateRequired.toString());
	order.append("\n");
	order.append("To: ");
	order.append(To.toString());
	order.append("\n");
	order.append("Ship To: ");
	order.append(ShipTo.toString());
	order.append("\n");
	order.append("Please ship the following: \n");
	for(PurchaseOrderRecord p : PurchaseOrderRecordTable) {
	    order.append(p.toString());
	}
	order.append("Ordered By: ");
	order.append(OrderedBy);
	order.append("\n");
	// Image
	order.append("Slip No.: ");
	order.append(SlipNo);
	order.append("\n");
	order.append(isOriginal ? "Original\n" : "CarbonCopy\n");
	order.append("Page No.: ");
	order.append(PageNo.toString());

	return order.toString();
    }
	
    private long No;
    private Date Date;
    private String FOB;
    private String VIA;
    private String Terms;
    private Date   DateRequired;
    private ToField To;
    private ShipToField ShipTo;
    private ArrayList<PurchaseOrderRecord> PurchaseOrderRecordTable;
    private String OrderedBy;
    private Image Logo;
    private long SlipNo;
    private boolean isOriginal;
    private PageNumber PageNo;
}
    
