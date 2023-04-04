
public class exercicio5 {
    public static void main(String[] args) {
        String sexo = "M";
        double altura = 1.85;
        double pesoFinalFeminino = (62.1*altura)-44.7;
        double pesoFinalMasculino = (72.7*altura)-58;
        if (sexo ==  "f"){
            System.out.println("Peso ideal " + pesoFinalFeminino );
        }
        else if (sexo ==  "M" || sexo == "m") {
            System.out.println("Peso ideal " + pesoFinalMasculino );
        }
        else {
            System.out.println("ENTRADA INVALIDA" );
        }



    }
}
