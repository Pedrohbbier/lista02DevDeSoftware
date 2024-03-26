public class Ex012 {
    public static void execute(){
        int tamanho = 12;
        int[] vetor = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + ": ");
        }
        
        int produto = calcularProdutoParesPositivos(vetor);
        
        Prompt.separador();
        Prompt.imprimir("O produto dos elementos pares positivos é:");
        Prompt.imprimir(produto);
    }
    
    public static int calcularProdutoParesPositivos(int[] vetor) {
        int produto = 1; 
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0 && vetor[i] % 2 == 0 && vetor[i] > 0) {
                produto *= vetor[i];
            }
        }
        return produto;
    }
}
