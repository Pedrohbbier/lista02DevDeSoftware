import java.util.Arrays;

public class Ex015 {
    public static void execute(){
        int tamanho = 5;
        int[] vetor = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            int numero = Prompt.lerInteiro("Digite o " + (i + 1) + "º número: ");
            if (i == 0 || numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                Prompt.imprimir("Número inválido! Por favor, digite um número maior que o anterior.");
                i--; 
            }
        }
        
        Prompt.separador();
        Prompt.imprimir("Vetor preenchido de acordo com a regra:");
        Prompt.imprimir(Arrays.toString(vetor));
    }
}
