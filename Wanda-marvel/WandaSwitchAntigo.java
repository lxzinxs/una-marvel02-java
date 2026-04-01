public class WandaSwitchAntigo {
    public static void main(String[] args) {
        String faseWanda = "WandaVision";
        String status;

        switch(faseWanda){
            case "Vingadora":
                status = "Heroina em treinamento";
                break;

            case "WandaVision":
                status = "Criação do Hex e vida suburbana";
                break;

            case "Feiticeira Escarlate":
                status = "Dominio da Magia do Caos";
                break;

            default:
                status = "Fase desconhecida";
                break; 
        }
        System.out.println("Status" + status);
    }
}
