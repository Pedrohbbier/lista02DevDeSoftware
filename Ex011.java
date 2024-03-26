public class Ex011 {
    public static void execute(){
        int tamanho = 5;
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        
        Prompt.imprimir("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            vetorA[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + ": ");
        }
        
        Prompt.imprimir("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + ": ");
        }
        
        int produtoEscalar = calcularProdutoEscalar(vetorA, vetorB);
        
        Prompt.separador();
        Prompt.imprimir("Produto escalar entre os vetores:");
        Prompt.imprimir(produtoEscalar);
    }
    
    public static int calcularProdutoEscalar(int[] vetorA, int[] vetorB) {
        int produtoEscalar = 0;
        for (int i = 0; i < vetorA.length; i++) {
            produtoEscalar += vetorA[i] * vetorB[i];
        }
        return produtoEscalar;
    }
}
