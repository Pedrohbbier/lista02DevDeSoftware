public class Program {
    public static void main(String[] args) {

        int ex = Prompt.lerInteiro("Digite qual exerciço deseja executar: ");

        switch (ex) {
            case 1:
                Ex001.execute();
                break;
            case 2:
                Ex002.execute();
                break;
            case 3:
                Ex003.execute();
                break;
            case 4:
                Ex004.execute();
                break;
            case 5:
                Ex005.execute();
                break;
            case 6:
                Ex006.execute();
                break;
            case 7:
                Ex007.execute();
                break;
            case 8:
                Ex008.execute();
                break;
            case 9:
                Ex009.execute();
                break;
            case 10:
                Ex010.execute();
                break;
            case 11:
                Ex011.execute();
                break;
            case 12:
                Ex012.execute();
                break;
            case 13:
                Ex013.execute();
            case 14:
                Ex014.execute();
            case 15:
                Ex015.execute();
                break;    
            default:
                Prompt.imprimir("Opção inválida!");
                break;
        }
    }
}
