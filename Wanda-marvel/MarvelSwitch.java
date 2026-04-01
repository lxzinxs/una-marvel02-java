public class MarvelSwitch {
    public static void main(String[] args) {
        String faseWanda = "Feiticeira Escarlate";

        String status = switch(faseWanda){
            case "vingadora" -> "Heroina em treinamento e controle dos poderes";
            case "WandaVision" -> "Criação de realidade alternativa (Hex) por luto";
            case "Feiticeira Escarlate" -> "Poder Maximo: Manipulação da magia do caos e do Darkhold";
            case "Civil War" -> "Confinamento no complexo do Vingadores";
            default -> "Fase não indentificada no Multiverso";
        };

        System.out.println("Status da Wanda: " + status);
    }
}
