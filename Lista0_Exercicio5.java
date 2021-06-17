public class Lista0_Exercicio5 {
    public static void main(String[] args) {
        System.out.println("1 Java atrapalha muita gente");
        for (int i=2; i<101; i++) {
            System.out.printf("%d Java ", + i);
            for (int b=0; b<i; b++) {
                System.out.print("atrapalham ");
            }    
            System.out.println("muita gente ");
        }
    }
}
