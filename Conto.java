public class Conto {
    //attributi
    public double saldo = 0.;
    private String cf;
    private String iban;
    //costruttore
    public Conto(String x, String y) {
        iban = x;
        cf = y;
    }
    //metodo preleva
    public boolean preleva(double importo){
        if(importo < 0){
            System.err.println("non puoi prelevare importi negativi");
            return false;
        }
        double nuovoSaldo = this.saldo - importo;
        if (nuovoSaldo >= 0 ){
            this.saldo = nuovoSaldo;
            System.out.println("saldo attuale "+this.saldo);
            return true;
        }
        else {
            System.out.println("non è stato possibile prelevare poichè il denaro sul conto non è sufficiente");
            return false;
        }
    }
    //metodo deposita
    public  boolean deposita(double importo){
        if (importo < 0){
            System.out.println("Non puoi depositare una somma negativa!!");
            return false;
        }
        else {
            double nuovoSaldo = this.saldo + importo;
            this.saldo = nuovoSaldo;
            System.out.println("saldo attuale "+this.saldo);
            return true;
        }
    }
}
