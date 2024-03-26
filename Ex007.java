public class Ex007 {
    public static void execute(){
        int tamanho = 5;
        int[] primeiroVetor = new int[tamanho];
        int[] segundoVetor = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            primeiroVetor[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do primeiro vetor: ");
        }
        
        for (int i = 0; i < tamanho; i++) {
            segundoVetor[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do segundo vetor: ");
        }
        
        boolean saoIguais = true;
        for (int i = 0; i < tamanho; i++) {
            if (primeiroVetor[i] != segundoVetor[i]) {
                saoIguais = false;
                break;
            }
        }
        
        Prompt.separador();
        if (saoIguais) {
            Prompt.imprimir("Os vetores são iguais.");
        } else {
            Prompt.imprimir("Os vetores não são iguais.");
        }
    }
}
