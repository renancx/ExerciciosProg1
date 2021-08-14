public class Services extends Entidade {
    //atributos
    static int contador;
    //metodos
    static int contaPossiveisCandidatos(Inimigo i[]){
        for (int j = 0; j < i.length; j++) {
            if(i[j].getPosicao > 100 && i[j].getEnergia() <= 50 && i[j].velocidade == 200){
                contador +=1;
            }
        }
        return contador;
    }
}