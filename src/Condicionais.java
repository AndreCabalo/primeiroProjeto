public class Condicionais {
    public static void main(String[] args) {

        int anoDeLancamento = 1986;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.5;
        String tipoPlano = "plus";

//        condição if simples
        if(anoDeLancamento > 2000) {
            System.out.println("Filme lançado apos 2000");
        } else {
            System.out.println("Filme lançado em 2000 ou antes");
        }

//        condicao if composta (com ou ||)
        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Pode assistir o filme, pois esta incluso no plano ou é assinante do plano plus");
        } else {
            System.out.println("Não é assinante do plano plus ou não está incluso no plano");
        }

        //        condicao if composta (com e &&)
        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Pode assistir o filme, pois esta incluso no plano E é assinante do plano plus");
        } else {
            System.out.println("Não é assinante do plano plus ou não está incluso no plano");
        }


//        Switch Cases
        String tipo = "comedia";
        switch (tipo) {
            case "comedia":
                System.out.println("Filme do tipo comédia");
                break;
            case "acao":
                System.out.println("Filme do tipo ação");
                break;
            case "drama":
                System.out.println("Filme do tipo drama");
                break;
            default:
                System.out.println("Filme de outro tipo");
        }
    }
}
