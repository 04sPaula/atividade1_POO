public class Caelum {
    public static void main(String[] args) {

        //Questão 1 e 2, capítulo 1 do Caelum
//        System.out.println("Essa é a primeira questão do livro.");
//        System.out.println("Feito! Prontinho! ;)");

        //Questão 3, capítulo 1 do Caelum
//        System.out.println("Essa é a primeira questão do livro.\nFeito! Prontinho! ;)");

        //---------------------------------------

        //Questão 1 e 2, capítulo 2 do Caelum
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        int mediaMensal = gastosTrimestre / 3;

        System.out.println(gastosTrimestre);
        System.out.println("Valor da média mensal: " + mediaMensal);

        //---------------------------------------

        //Questão 1, capítulo 3 do Caelum: Para saber mais
        System.out.println("Sobre do while, ele é interessante para quando você não sabe a quantidade exata de" +
                " vezes que será necessário manter aquele loop como ocorre no for, e também opera sob uma condição" +
                " como um if versão loop. Já o case switch é mais útil quando a diferença é através de opções," +
                " como no uso de um menu, que tem mais de duas opções, diferente do if else que só dá duas.");

        //Questão 2, capítulo 3 do Caelum: Para saber mais
        System.out.println("Pelo que pesquisei, não é uma prática muito recomendada, mas não por ele em si," +
                " e sim pela situação que cria a necessidade dele ser utilizado, já que é através de múltiplos" +
                " loops aninhados.");

        //Questão 3, capítulo 3 do Caelum: Para saber mais
        System.out.println("No Java, se você dividir um número inteiro por 0, ocorrerá uma exceção" +
                "ArithmeticException com a mensagem 'division by zero'. Se dividir por 0.0, o resultado será" +
                " Infinity se o inteiro for positivo ou -Infinity caso seja negativo.");

        //Questão 4, capítulo 3 do Caelum: Para saber mais
        System.out.println("byte → short → int → long → float → double");

        //Questão 5, capítulo 3 do Caelum: Para saber mais
        System.out.println("Mesma coisa do i++ ou i--, respectivamente. É mais abreviado que i = i + 1," +
                " mas eu acredito que o i++ seja mais abreviado e prático. Quanto a ordem do sinal --" +
                " em relação 1, ele determina se o decremento vai ser antes ou depois do negócio ser feito.");
    }
}
