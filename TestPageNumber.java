// From JUnit5 Documentation modified to fit tests

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// class TestPageNumber {
//     @Test
//     void assertsOutputOfPageIsFormattedCorrectly() {
// 	PageNumber P01_11 = new PageNumber(1, 11);
//         assertEquals(P01_11.toString(), "1-11");
//     }
// }

public class TestPageNumber {
    public static void main(String... args) {
	PageNumber P01_11 = new PageNumber(1, 11);
	System.out.println(P01_11);
    }
}
