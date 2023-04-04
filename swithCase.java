public class swithCase {
    public static void main(String[] args) {

        String status = "PENDENT";

        switch (status){
            case "PAID":
                System.out.println("pagamento realizado com sucesso");
                break;
            case "PENDENT":
                System.out.println("sua compra esta pendente de aprovação");
                break;
            default:
                System.out.println("Não foi possivel processar seu pagamento");
        }


    }
}


