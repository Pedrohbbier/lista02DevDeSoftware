public class Ex008 {
    public static void execute() {
        int tamanho = 5;
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] vetorC = new int[tamanho * 2];
        
        for (int i = 0; i < tamanho; i++) {
            vetorA[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor A: ");
        }
        
        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor B: ");
        }
        
        for (int i = 0; i < tamanho; i++) {
            vetorC[i] = vetorA[i];
            vetorC[i + tamanho] = vetorB[i];
        }
        
        Prompt.separador();
        Prompt.imprimir("Vetor C (concatenação de A e B):");
        for (int i = 0; i < vetorC.length; i++) {
            Prompt.imprimir(vetorC[i]);
        }
    }
}
