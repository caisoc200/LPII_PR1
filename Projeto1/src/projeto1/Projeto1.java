/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

import java.util.Scanner;

/**
 *
 * @author caiod
 */
public class Projeto1 {

    public static Pesoas adicionaralguem(Scanner s) {
        Pesoas pessoa = new Pesoas();
        int loop = 0;
        while (loop == 0) {
            System.out.println("Que tipo de pessoa vai ser chamada?");
            System.out.println("-----------------------------------");
            System.out.println("1  -  Informal");
            System.out.println("2  -  Formal");
            System.out.println("3  -  Espanhol");
            if (s.hasNextInt()) {
                loop = s.nextInt();
            } else {
                System.out.println("Não reconhecemos sua resposta, reinicie.");
                System.exit(0);
            }
            if (loop > 3 || loop < 1) {
                loop = 0;
                System.out.println("Escolha uma opção valida!");
            } else {
                pessoa.setTipoPessoa(loop);
            }
        }
        return pessoa;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1 - Chamar alguem.");
        System.out.println("------------------");
        System.out.println("2 - Sair");
        int resposta = 0;
        Pesoas[] Instanciadas = new Pesoas[2];
        while (resposta > 2 || resposta < 1) {
            if (s.hasNextInt()) {
                resposta = s.nextInt();
            } else {
                System.out.println("Não reconhecemos sua resposta, reinicie.");
                System.exit(0);
            }
            if (resposta == 1) {
                Instanciadas[0] = adicionaralguem(s);
            } else if (resposta == 2) {
                System.out.println("Ok, rode o sistema novamente quando quiser interagir.");
                System.exit(0);
            } else {
                System.out.println("Digite uma opção valida");
                System.out.println("1 - Chamar alguem.");
                System.out.println("------------------");
                System.out.println("2 - Sair");
                if (s.hasNextInt()) {
                    resposta = s.nextInt();
                } else {
                    System.out.println("Não reconhecemos sua resposta, reinicie.");
                    System.exit(0);
                }
            }
        }
        System.out.println("1 - Chamar segunda pessoa.");
        System.out.println("------------------");
        System.out.println("2 - Sair");
        resposta = 0;
        while (resposta > 2 || resposta < 1) {
            if (s.hasNextInt()) {
                resposta = s.nextInt();
            } else {
                System.out.println("Não reconhecemos sua resposta, reinicie.");
                System.exit(0);
            }
            if (resposta == 1) {
                Instanciadas[1] = adicionaralguem(s);
            } else if (resposta == 2) {
                System.out.println("Ok, rode o sistema novamente quando quiser interagir.");
                System.exit(0);
            } else {
                System.out.println("Digite uma opção valida");
                System.out.println("1 - Chamar segunda pessoa.");
                System.out.println("------------------");
                System.out.println("2 - Sair");
                if (s.hasNextInt()) {
                    resposta = s.nextInt();
                } else {
                    System.out.println("Não reconhecemos sua resposta, reinicie.");
                    System.exit(0);
                }
            }
        }
        while (true) {
            System.out.println("Opções:");
            System.out.println("------------------");
            System.out.println("1 - " + Instanciadas[0].getTipoPessoatexto() + "Saudação");
            System.out.println("2 - " + Instanciadas[0].getTipoPessoatexto() + "Apresentação");
            System.out.println("3 - " + Instanciadas[0].getTipoPessoatexto() + "Sentimento");
            System.out.println("4 - " + Instanciadas[1].getTipoPessoatexto() + "Saudação");
            System.out.println("5 - " + Instanciadas[1].getTipoPessoatexto() + "Apresentação");
            System.out.println("6 - " + Instanciadas[1].getTipoPessoatexto() + "Sentimento");
            System.out.println("7 - Sair");
            if (s.hasNextInt()) {
                resposta = s.nextInt();
            } else {
                System.out.println("Não reconhecemos sua resposta, reinicie.");
                System.exit(0);
            }
            if (resposta > 0 || resposta < 8) {
                if (resposta == 1) {
                    System.out.println(Instanciadas[0].saudacao());
                }
                if (resposta == 2) {
                    System.out.println(Instanciadas[0].apresentacao());
                }
                if (resposta == 3) {
                    System.out.println(Instanciadas[0].sentimento());
                }
                if (resposta == 4) {
                    System.out.println(Instanciadas[1].saudacao());
                }
                if (resposta == 5) {
                    System.out.println(Instanciadas[1].apresentacao());
                }
                if (resposta == 6) {
                    System.out.println(Instanciadas[1].sentimento());
                }
                if (resposta == 7) {
                    System.exit(0);
                }
            } else {
                System.out.println("Digite um comando valido");
            }
        }
    }
}
