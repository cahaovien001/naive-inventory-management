public class TestToField {
    public static void main(String... args) {
       	ToField to = new ToField("Cahao Vien",
				 ToField.makeAddress("95 Judson St. Apt. 1",
						     "Malden",
						     "MA",
						     "02148"));
	System.out.println(to);
    }
}
