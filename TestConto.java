public class TestConto {
    public static void main(String[] args) {
        Conto c1 = new Conto("iban", "cf");
        c1.deposita(100);
        c1.preleva(15);
        Banca b1 = new Banca("Intesa", 14);
        b1.aggiungiConto("cod fisc");
        b1.aggiungiConto("cod fisc");
        b1.aggiungiConto("cod fisc");
        b1.totaleSaldi();
    }
}
