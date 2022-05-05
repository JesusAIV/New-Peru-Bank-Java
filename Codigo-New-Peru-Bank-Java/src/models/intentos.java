package models;
import java.util.Scanner;

public class intentos {

    public void intentosV(){
        Scanner sc = new Scanner(System.in);

        String[] dniS = {"74893553","65439870","76542374","47802006","45678092"};
        String[] passwordS = {"*****","nieve321","yato543","ninomio11","minino220"};
        String[] userS = {"JESUS","ALBERTO","YDALIA","KONY","JAZMINE"};
        
        cliente client = new cliente();
        operacion op = new operacion();
        
        boolean val = client.Validator(dniS, passwordS, userS);
        double saldo = 0.0;
        int contador = 0;

        while (contador < 3 ){
            if (val == true) {
                saldo = op.OperacionRealizada(contador, saldo);
                System.out.println("\nDesea Continuar [si] | [no]");
                String pregunta = sc.nextLine();
                if (pregunta.equals("si")){
                    contador = 0;
                }else{
                    System.out.println("¡¡GRACIAS POR SU PREFERENCIA!!");
                    contador = 4;
                }
            }else if (contador < 1){
                System.out.println("ERROR,vuelva a ingresar");
                val = client.Validator(dniS, passwordS, userS);
                contador++;
            }else if(contador == 2){
                contador = 4;
            }else if(contador == 1 ){
                System.out.println("Ultimo intento");
                val = client.Validator(dniS, passwordS, userS);
                contador++;
            }
        }
 
    }
}
