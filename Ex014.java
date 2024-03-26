import java.util.Arrays;

public class Ex014 {
    public static void execute(){
        int tamanho = 5;
        int[] vetor = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + ": ");
        }
        
        posicionarMaiorElementoUltimaPosicao(vetor);
        
        Prompt.separador();
        Prompt.imprimir("Vetor atualizado com o maior elemento na última posição:");
        Prompt.imprimir(Arrays.toString(vetor));
    }
    
    public static void posicionarMaiorElementoUltimaPosicao(int[] vetor) {
        int tamanho = vetor.length;
        
        int indiceMaior = 0;
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }
        
        int maiorElemento = vetor[indiceMaior];
        for (int i = indiceMaior; i < tamanho - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        vetor[tamanho - 1] = maiorElemento;
    }
}
