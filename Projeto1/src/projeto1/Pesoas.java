/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

/**
 *
 * @author caiod
 */
public class Pesoas {

    private int tipopessoa;

    public String saudacao() {
        switch (getTipoPessoa()) {
            case 1:
                return "Eae mano, blz?";
            case 2:
                return "Ola, tudo bem?";
            case 3:
                return "¡Hola! ¿Qué tal?";
        }
        return "";
    }

    public String apresentacao() {
        switch (getTipoPessoa()) {
            case 1:
                return "Sou o monstro da programação, e você?";
            case 2:
                return "Eu sou um programador com muitos anos de experiencia,e vóssa senhoria?";
            case 3:
                return "yo soy bueno programando, ¿y tu?";
        }
        return "";
    }

    public String sentimento() {
        switch (getTipoPessoa()) {
            case 1:
                return "Dahora te conhecer!";
            case 2:
                return "Foi um prazer conhece-lo!";
            case 3:
                return "¡Encantado de conocerte!";
        }
        return "";
    }

    public void setTipoPessoa(int N) {
        if (N < 4 && N > 0) {
            this.tipopessoa = N;
        }
    }

    public int getTipoPessoa() {
        return this.tipopessoa;
    }

    public String getTipoPessoatexto() {
        switch (this.tipopessoa) {
            case 1:
                return "Informal";
            case 2:
                return "Formal";
            case 3:
                return "Espanhol";
        }
        return "";
    }
}
