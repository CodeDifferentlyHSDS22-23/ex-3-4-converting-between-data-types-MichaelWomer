public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "20";
        String taxRate = "0.07";
        String gibberish = "jfjfdlfdsjkdsfjkioreui";

        //Parse shirtPrice and taxRate, and print the total tax
        System.out.println(Integer.parseInt(shirtPrice) * Double.parseDouble(taxRate));

        //Try to parse taxRate as an int
        //Integer.parseInt(taxRate);
        //Try to parse gibberish as an int
        //Integer.parseInt(gibberish);

    }

}
