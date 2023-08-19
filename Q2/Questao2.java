package Q2;

public class Questao2 {

    public static void main (String [] args){

        int vetA[] = new int [10];
        int parlmpar[] = new int [2];
        parlmpar[0] = 0;
        parlmpar[1] = 0;

        //Preenchendo o vetor, com quaisquer números
        for (int i = 0; i < 10; i++) {
            vetA[i] = i * 3; 
        }

        for(int i=0; i<10; i++){
            if(vetA[i] % 2 == 0){
                parlmpar[0] += 1;
            } else{
                parlmpar[1] += 1;
            }
        }

        System.out.println("Números pares: " + parlmpar[0]);
        System.out.println("Números ímpares: " + parlmpar[1]);
    }
}
