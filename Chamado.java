
import javax.swing.JOptionPane;

public class Chamado{
    private String nomecliente;
    private String problema;
    private double custoatendimento;
    private double custopecas;
    double total;
    String texto;

    public Chamado(String n, String p){
        this.nomecliente = n;
        this.problema = p;
    }
    public Chamado(String n, String p, double ca, double cp){
        this.nomecliente = n;
        this.problema = p;
        this.custoatendimento = ca;
        this.custopecas = cp;
    }


    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }
    public void setProblema(String problema) {
        this.problema = problema;
    }
    public void setCustoatendimento(double custoatendimento) {
        this.custoatendimento = custoatendimento;
    }
    public void setCustopecas(double custopecas) {
        this.custopecas = custopecas;
    }
    public String getNomecliente() {
        return nomecliente;
    }
    public String getProblema() {
        return problema;
    }
    public double getCustoatendimento() {
        return custoatendimento;
    }
   
    public double getCustopecas() {
        return custopecas;
    }



    public void acrescentaPeca(double valor){
        custopecas = valor + this.custopecas;
    }
    public void acrescentaPeca(int qtde, double valor){
        custopecas = qtde * valor + this.custopecas;
    }
    public double calculaTotal(){
        double total;
        total = this.custoatendimento + this.custopecas;
        return total;
    }
    public String menorValorPeca(Chamado ch){
        double c1, c2;
        c1 = this.custopecas;
        c2 = ch.custopecas;
        if (c1 < c2) {
            return this.nomecliente;
        } else{
            return ch.nomecliente;
        }
    }
    public Chamado maiorCusto(Chamado ch){
        double c1, c2;
        c1 = this.total;
        c2 = ch.total;
        if (c1 > c2 ) {
            return this;
        } else{
            return ch;
        }
    }
    public String exibir(){
        JOptionPane.showMessageDialog(null, "Informações do chamado: \nCliente: " + nomecliente + "\nProblema: " + problema + "\nValot total do atendimento: " + calculaTotal());
        return texto;
    }    
}