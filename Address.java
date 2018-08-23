public class Address {
    public Address(String s,
		   String c,
		   String t,
		   String z) {
	Street  = s;
	City    = c;
	State   = t;
	ZipCode = z;
    }

    public String street() {
	return Street;
    }

    public String city() {
	return City;
    }

    public String state() {
	return State;
    }

    public String zipCode() {
	return ZipCode;
    }

    public String toString() {
	StringBuilder address = new StringBuilder();

	address.append(Street);
	address.append("\n");
	address.append(City);
	address.append(", ");
	address.append(State);
	address.append(" ");
	address.append(ZipCode);

	return address.toString();
    }

    private String Street;
    private String City;
    private String State;
    private String ZipCode;
}
