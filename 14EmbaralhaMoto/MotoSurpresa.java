public class MotoSurpresa {
    public static void main (String[] args){
        String[] marca = {"Harley-Davidson", "Honda", "Yamaha", "Suzuki", "BMW", "Indian", "Royal Enfield", "Ducati"};
        String[] estadoGeral = {"Com Acessorios", "Sem Acessórios", "Customizada", "Original de Fabrica", "Semi-Nova", "Zero KM"};
        String[] cor = {"Preta", "Vermelha", "Azul", "Amarela", "Prata", "Roxa"};

        int tamanhoMarca =  marca.length;
        int tamanhoEstadoGeral = estadoGeral.length;
        int tamanhoCor = cor.length;


        int buscaMarca = (int) (Math.random() * marca.length);
        int buscaEstadoGeral = (int) (Math.random() * estadoGeral.length);
        int buscaCor = (int) (Math.random() * cor.length);

    String sugestaoDeMoto = marca[buscaMarca] + ", " + estadoGeral[buscaEstadoGeral] + ", na cor " + cor[buscaCor];

    System.out.println ("A moto perfeita pra voce é uma " + sugestaoDeMoto);

    }
}