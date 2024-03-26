public class Ex010 {
    public static void execute(){
        int tamanho = 5;
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            vetorA[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor A: ");
        }
        
        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = vetorA[tamanho - 1 - i];
        }
        
        Prompt.separador();
        Prompt.imprimir("Vetor B (com os elementos de A invertidos):");
        for (int i = 0; i < tamanho; i++) {
            Prompt.imprimir(vetorB[i]);
        }
    }
}
