import java.util.Arrays;

public class Banca {
    //attributi
    private String nome;
    private int nMassimoConti;
    private Conto arrayConti[];
    private int nContiAttivi;
    private String radiceIban;
    //costruttore
    public Banca(String n, int ncontimax) {
        nContiAttivi = 0;
        nome = n;
        nMassimoConti = ncontimax;
        arrayConti = new Conto[ncontimax];
    }
    /*provo a stampare lunghezza array
    public void stampaLunghezza(){
        int n = arrayConti.length;
        System.out.println(n);*/
    //metodo aggiungi conto
    public Conto aggiungiConto(String codiceFiscale) {
        this.nContiAttivi += 1;
        if (this.nContiAttivi > this.nMassimoConti) {
            this.nContiAttivi -= 1;
            System.err.println("hai raggiunto il massimo dei conti apribili");
        }
        else {
            this.arrayConti[nContiAttivi] = new Conto(this.radiceIban+"00000"+this.nContiAttivi, codiceFiscale);
            System.out.println(this.arrayConti[nContiAttivi]);
        }
        return arrayConti[nContiAttivi];
    }
    public void totaleSaldi(){
        double []tuttiISaldi = new double[this.nContiAttivi];
        int i;
        for (i=0; i <= this.nContiAttivi; i +=1){
            Conto x = this.arrayConti[i];
            tuttiISaldi[i] = x.saldo;
            System.out.println(tuttiISaldi[i]);
        }


    }
}
