public class Teste {

    public static void main(String[] args){
        System.out.println("Olá mundo");

        System.out.println((10.0/6));

        try {
            System.out.println(0/0);
        } catch(ArithmeticException e) {
            System.out.println("Não pode dividir por zero");
        }

        System.out.println("Fim");
    }
}
