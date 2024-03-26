public class Ex003 {

    public static void execute() {
        int tamanho = Prompt.lerInteiro("Digite o tamanho do vetor: ");
        int[] primeiroVetor = new int[tamanho];
        int[] segundoVetor = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            primeiroVetor[i] = Prompt.lerInteiro("Digite o número " + (i + 1) + ": ");
        }
        
        for (int i = 0; i < tamanho; i++) {
            segundoVetor[i] = primeiroVetor[i] * 2;
        }
        
        Prompt.separador();
        Prompt.imprimir("Valores do segundo vetor (dobro dos valores do primeiro vetor):");
        for (int i = 0; i < tamanho; i++) {
            Prompt.imprimir(segundoVetor[i]);
        }
    }
}
