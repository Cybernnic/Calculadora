package Calculadora;

import javax.swing.JOptionPane;

import Calculadora.Calculadora;
public class Principal {
    public static void main(String[]args){
        String opcao="";
        Calculadora calculadora=new Calculadora();
        while(!opcao.equals("9")) {
        	opcao = JOptionPane.showInputDialog("1-Leitura\n2-Soma\n3-Subtra��o"+"\n4-Produto\n5-Divis�o\n9-Sair");
            switch(Integer.parseInt(opcao)) {
                 case 1:
                     calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("DigiteovalorA")));
                     calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("DigiteovalorB")));
                     break;
                 case 2:
                     JOptionPane.showMessageDialog(null,"Soma:"+calculadora.getAdicao());
                     break;
                 case 3:
                     JOptionPane.showMessageDialog(null,"Subtra��o:"+calculadora.getSubtracao());
                     break;
                 case 4:
                     JOptionPane.showMessageDialog(null,"Produto:"+calculadora.getProduto());
                     break;
                 case 5:
                     JOptionPane.showMessageDialog(null,"Divis�o:"+calculadora.getDivisao());
                     break;
}}}}