public class Main {
    public static void main(String[] args) {
        System.out.println("Exercícios:\n" +
                "   - Para saber mais, página 25;\n" +
                "   - Exercícios: Fixação de sintaxe, pag 26\n" +
                "   - Desafios: Fibonacci, pag 27\n" +
                "   - Capítulo 1 e 2 do caelum.\n");

        // Questão 8, cap 2, k19
//        for (int contador = 0; contador < 100; contador++) {
//            System.out.println("Paula Souza Alves");
//        }

        //Questão 10, cap 2, k19
//        for (int contador = 1; contador <= 100; contador++) {
//            System.out.println(contador);
//        }

        //Questão 14, cap 2, k19
//        for (int contador = 1; contador <=100; contador++) {
//            if (contador % 2 == 0) {
//                System.out.println("*");
//            } else {
//                System.out.println("**");
//            }
//        }

        //Questão 17, cap 2, k19
        for (int contador = 1; contador <= 100; contador++) {
            if (contador % 4 == 0) {
                System.out.println("PIN");
            } else {
                System.out.println(contador);
            }
        }
    }
}