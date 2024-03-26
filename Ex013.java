public class Ex013 {
    public static void execute(){
        int n = Prompt.lerInteiro("Digite o número de termos da sequência de Fibonacci: ");
        
        int[] fibonacci = gerarFibonacci(n);
        
        Prompt.separador();
        Prompt.imprimir("Os " + n + " primeiros termos da sequência de Fibonacci:");
        for (int i = 0; i < n; i++) {
            Prompt.imprimir(fibonacci[i]);
        }
    }
    
    public static int[] gerarFibonacci(int n) {
        int[] fibonacci = new int[n];
        
        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }
        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        return fibonacci;
    }
}
