package github.britooo;

public class InverterTextoStack {
    public static String inverter(String input) {
        /*
            É óbvio que não precisamos de uma pilha para resolver esse
            problema, porém, precisamos desenvolver nosso raciocínio lógico!

            Então, não fique pilhado, use a classe Pilha.
        */
        Pilha pilha = new Pilha(input.length());
        String palavraInvertida = "";

        for (int i = 0; i < input.length(); i++) {
            pilha.push(input.charAt(i));
        }

        for (int j = 0; j < input.length(); j++) {
            palavraInvertida += pilha.pop();
        }
        return palavraInvertida;
    }
}
