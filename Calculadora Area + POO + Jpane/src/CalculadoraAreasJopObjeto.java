import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class CalculadoraAreasJopObjeto {

    public static void opcoes(){
        String[] conta = new String [6];
        conta[0] = "Quadrado";
        conta[1] = "Triangulo";
        conta[2] = "Trapezio";
        conta[3] = "Retangulo";
        conta[4] = "Paralelogramo";
        conta[5] = "Circulo";
        ImageIcon icone = new ImageIcon("Calculadora Area + POO + Jpane/images/meio.jpeg");
        String opcaoEscolhida = (String) JOptionPane.showInputDialog(null, "Que objeto você deseja calcular?", "Calculadora de Areas", JOptionPane.QUESTION_MESSAGE, icone, conta, conta[0]);
        
        contas escolhaContas = new contas();

        if (opcaoEscolhida.equals(conta[0])) {
            System.out.println("Area do Quadrado");
            escolhaContas.quadrado();
            finalizar();    
        }
        if (opcaoEscolhida.equals(conta[1])) {
            System.out.println("Area do Triangulo");
            escolhaContas.triangulo();
            finalizar();
        }
        if (opcaoEscolhida.equals(conta[2])) {
            System.out.println("Area do Trapezio");
            escolhaContas.trapezio();
            finalizar();
        }
        if (opcaoEscolhida.equals(conta[3])) {
            System.out.println("Area do Retangulo");
            escolhaContas.retangulo();
            finalizar();
        }
        if (opcaoEscolhida.equals(conta[4])) {
            System.out.println("Area do Paralelogramo");
            escolhaContas.paralelogramo();
            finalizar();
        }
        if (opcaoEscolhida.equals(conta[5])) {
            System.out.println("Area do Circulo");
            escolhaContas.circulo();
            finalizar();
        }
 }

    public static void finalizar(){
    ImageIcon icon = new ImageIcon("Calculadora Area + POO + Jpane/images/lopping.jpeg");
    int opcao = JOptionPane.showOptionDialog(null,"Cálculo finalizado\nDeseja voltar ao início?","Cálculo Finalizado com Sucesso",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,icon,null,null);
    if (opcao == JOptionPane.YES_OPTION) {
        inicio();
    } else {
        ImageIcon icone = new ImageIcon("Calculadora Area + POO + Jpane/images/fim.jpeg");
        JOptionPane.showMessageDialog(null, "Ate a proxima!", "Opção 'Não' Escolhida", JOptionPane.INFORMATION_MESSAGE, icone);
    }
}
    public static void inicio(){
        ImageIcon icon = new ImageIcon("Calculadora Area + POO + Jpane/images/inicio.jpeg");
        int entrada = JOptionPane.showOptionDialog(null, "Bem vindo a Calculadora de Areas\nDeseja começar os calculos ?", "Calculadora de Areas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon, null, null);
        if (entrada == JOptionPane.YES_OPTION){
        opcoes();
        }else {
            System.out.println("Bye bye !!");
        }
    
    } 

    public static void main(String[] args) throws Exception {
        inicio();
    }
}
