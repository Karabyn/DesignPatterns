package patterns.behavioral.strategy.example_2;

public class StrategyDemo {

    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464283");
        amexCard.setDate("00/0000");
        amexCard.setCvv("000");

        System.out.println("Is Amex valid: " + amexCard.isValid());

        CreditCard amexCard2 = new CreditCard(new AmexStrategy());

        amexCard2.setNumber("379185333464283");
        amexCard2.setDate("00/0000");
        amexCard2.setCvv("000");

        System.out.println("Is Amex valid: " + amexCard2.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("4539589763663402");
        amexCard2.setDate("00/0000");
        amexCard2.setCvv("000");

        System.out.println("Is Visa valid: " + visaCard.isValid());


    }
}
