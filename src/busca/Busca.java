package busca;

import java.util.Scanner;

public class Busca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dados busca = new Dados();
        int val,pos,posb;
        
        busca.gerador();
        
        System.out.print("\nDigite um valor: ");
        val = in.nextInt();
        
        System.out.println("Iterações");
        System.out.print("Sequencial: ");
        pos = busca.sequencial(val);
        
        System.out.print("Binária: ");
        posb = busca.binaria(val);
        
        System.out.println("\n---------------------------------\n");
        
        System.out.println(" ------ BUSCA SEQUENCIAL------ ");
        if(busca.sequencial(val) == -1){
            System.out.println("Inválido");
        }
        else {
            System.out.println("Achou na posição " + pos);
        }
        System.out.println("==========================================");
        //////////////////////////////////////////////////////////////////
        System.out.println(" ------ BUSCA BINÁRIA------ ");
        if(busca.binaria(val) == -1){
            System.out.println("Inválido");
        }
        else {
            System.out.println("Achou na posição " + posb);
        }
        
    }
    
}
