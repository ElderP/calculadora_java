package br.com.elder;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 0;
        int divisao;
        int resto;

        boolean validacao = false;
        String entrada;

        while (!validacao){
            entrada = JOptionPane.showInputDialog("Informe o primeiro número inteiro");
            if (validaFormato(entrada)){
                validacao = true;
                n1 = Integer.parseInt(entrada);
            }
        }

        validacao = false;

        while (!validacao){
            entrada = JOptionPane.showInputDialog("Informe o segundo número inteiro");
            if (validaFormato(entrada)){
                validacao = true;
                n2 = Integer.parseInt(entrada);
            }
        }

        divisao = n1 / n2 ;

        resto = n1 % n2 ;

        JOptionPane.showMessageDialog(null, "n1 / n2 = " +divisao);
        JOptionPane.showMessageDialog(null, "n1 % n2 = " +resto);

    }

    public static boolean validaFormato(String valor){
        boolean validacao = false;
        double resultado ;

        try {
            resultado = Integer.parseInt(valor);
            validacao = true;
        }catch (Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro "+e );
        } finally {
            System.out.println("Validação finalizada com resultado "+validacao);
        }

        return validacao;

    };
    
}
