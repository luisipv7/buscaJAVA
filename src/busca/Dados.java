package busca;

import java.util.Arrays;
import java.util.Random;

public class Dados {
    // int vetor[] = {12,19,23,30,31,32,33,34,37,41,42,43,44,45,46,47,48,49,50,51,52,53,54,66,74,83,87,91,95,98};

    int size = 400;

    int vetor[] = new int[size];
    Random r = new Random();

    //MÉTODO GERANDO VALOR ALEATÓRIO
    public void gerador() {
        for (int i = 0; i < size; i++) {
            vetor[i] = r.nextInt(1000)+1;
        }
        Arrays.sort(vetor);
        for (int nums : vetor){
            System.out.print(nums + " ");
        }
    }

    //MÉTODO SEQUENCIAL 
    public int sequencial(int val) {
        int iteracoes = 1;
        for (int pos = 0; pos < vetor.length; pos++) {
            if (vetor[pos] == val) {
                System.out.println("iterações: " + iteracoes);
                return pos;
            }
            iteracoes++;
        }
        System.out.println("iterações: " + iteracoes);
        return -1;
    }

    //MÉTODO BINÁRIO
    public int binaria(int val) {
        int inicio, meio, fim, iteracoes;
        iteracoes = 1;
        inicio = 0;
        fim = vetor.length - 1;
        // ENQUANTO O INICIO FOR MENOR QUE O FIM
        while (inicio <= fim) {
            iteracoes++;
            meio = (inicio + fim) / 2;
            if (val == vetor[meio]) {
                System.out.println("iterações: " + iteracoes);
                return meio;
            } else if (val > vetor[meio]) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        System.out.println("iterações: " + iteracoes);
        return -1;
    }

}
