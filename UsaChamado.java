import javax.swing.JOptionPane;

public class UsaChamado {
    public static void main(String[] args) {
        String nome;
        String prob;
        double custoA;
        double custoP;
        double ca;
        double cp;
        double custoAdicional;
        int qtde;
        double valorAdicional;
        String menorValor;       

        //Chamado 1
        Chamado c1 = new Chamado("Bruno", "Prova parcial");

        ca = Integer.parseInt(JOptionPane.showInputDialog("Digite o custo de atendimento do cliente 1: "));
        cp = Integer.parseInt(JOptionPane.showInputDialog("Digite o custo das peças do cliente 1: "));
        c1.setCustoatendimento(ca);
        c1.setCustopecas(cp);

        qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de peças: "));
        valorAdicional = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor adicional de peças: "));
        c1.acrescentaPeca(qtde, valorAdicional);


        //Chamado 2
        nome = JOptionPane.showInputDialog("Digite o nome do cliente 2: ");
        prob = JOptionPane.showInputDialog("Digite o problema do cliente 2: ");
        custoA = Integer.parseInt(JOptionPane.showInputDialog("Digite o custo do atendimento 2: "));
        custoP = Integer.parseInt(JOptionPane.showInputDialog("Digite o custo das peças 2: "));

        Chamado c2 = new Chamado(nome, prob, custoA, custoP);
        
        custoAdicional = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor adicional de peças: "));
        c2.acrescentaPeca(custoAdicional);

     
        Chamado c3;
        c3 =  c1.maiorCusto(c2);

        menorValor = c1.menorValorPeca(c3);

        c1.exibir();
        c2.exibir();
        c3.exibir();


    }
}
