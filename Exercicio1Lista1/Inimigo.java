public class Inimigo extends Boid {
    //atributos
    private int vida;
    //metodos
    public int getVida(){
        return this.vida;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public Inimigo achaAlvoMaisProximo(Inimigo i[]){
        for(int j = 0;  j < i.length; j++) {
            if (i[j].getX == super.getX && i[j].getY == super.getY && i[j].getA == super.getA && i[j].getB == super.getB){
                return i[j];
            }
        }
    }
}