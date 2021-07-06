class Circulo {
    //atributos
    private int raio;
    private double pi = 3.14;

    //metodos
    public Circulo(int raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double area() {
        double area = (raio*raio) * pi;
        return area;
    }   
    
    public double circunf() {
        double circunf = 2 * pi * raio;
        return circunf;
    }
}