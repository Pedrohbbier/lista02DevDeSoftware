public class Ex002 {

    public static void execute() {
        int tamanho = Prompt.lerInteiro("Digite o tamanho do vetor: ");
        double[] vetor = new double[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Prompt.lerDecimal("Digite o número " + (i + 1) + ": ");
        }
        
        Prompt.separador();
        for (int i = 0; i < tamanho; i++) {
            Prompt.imprimir("Número na posição " + (i + 1) + ": " + vetor[i] + " - " + verificarSinal(vetor[i]));
        }
    }
    
    public static String verificarSinal(double numero) {
        if (numero > 0) {
            return "Positivo";
        } else if (numero < 0) {
            return "Negativo";
        } else {
            return "Zero";
        }
    }
}
