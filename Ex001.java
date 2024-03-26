public class Ex001 {

    public static void execute() {
        int tamanho = 5;
        int[] vetor = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o número " + (i + 1) + ": ");
        }
        
        double soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }
        double media = soma / tamanho;
        
        Prompt.separador();
        Prompt.imprimir("A média dos números é: " + media);
        
        Prompt.imprimir("Valores menores que a média:");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] < media) {
                Prompt.imprimir(vetor[i]);
            }
        }
        
        Prompt.imprimir("Valores iguais à média:");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == media) {
                Prompt.imprimir(vetor[i]);
            }
        }
        
        Prompt.imprimir("Valores superiores à média:");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > media) {
                Prompt.imprimir(vetor[i]);
            }
        }
    }
}

