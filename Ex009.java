public class Ex009 {
    public static void execute(){
        int tamanho = 5;
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] vetorC = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            vetorA[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor A: ");
        }
        
        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor B: ");
        }
        
        for (int i = 0; i < tamanho; i++) {
            if (i % 2 == 0) {
                vetorC[i] = vetorA[i];
            } else {
                vetorC[i] = vetorB[i];
            }
        }
        
        Prompt.separador();
        Prompt.imprimir("Vetor C (de acordo com as regras especificadas):");
        for (int i = 0; i < tamanho; i++) {
            Prompt.imprimir(vetorC[i]);
        }
    }
}

