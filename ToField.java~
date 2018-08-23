public class ToField {
    private String Name;
    private Address Address;

    public ToField(String u, Address a) {
	Name = u;
	Address = a;
    }

    public String name() {
	return Name;
    }

    public Address address() {
	return Address;
    }

    public String toString() {
	StringBuilder toField = new StringBuilder();

	toField.append(Name);
	toField.append("\n");
	toField.append(Address.toString());

	return toField.toString();
    }

    public static Address makeAddress(String s, String c, String t, String z) {
	return new Address(s, c, t, z);
    }
}
