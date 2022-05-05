package models;
import java.util.Scanner;

public class operacion {
    
    public String opcion;
    
    public operacion(){

    }
    public operacion(String operacion){
        this.opcion = operacion;
    }
    public double OperacionRealizada(int contador, double saldo){
        Scanner sc = new Scanner(System.in);
        double NuevoSaldo = saldo;
        double montoDdeposito = 0.0;
        
        System.out.println("\nElija la Operacion que Desees Realizar:\n"
                + "[1] Deposito\n"
                + "[2] Retiro\n"
                + "[3] Consulta de Saldo\n"
                + "[4] Salir");
        String opciones = sc.nextLine();
        if (opciones.equals("1")){
            System.out.println("Ingrese la Cantidad a Depositar : ");
            montoDdeposito = sc.nextDouble();
            NuevoSaldo = saldo + montoDdeposito;
            System.out.println("\n¡¡OPERACION EXITOSA!!");
        }else if (opciones.equals("2")){
            if (NuevoSaldo > montoDdeposito ){
                System.out.println("Ingrese la Cantidad a Retirar : " );
                double montoDretiro = sc.nextDouble();
                NuevoSaldo = saldo - montoDretiro;
                System.out.println("\n¡¡OPERACION EXITOSA!!");
            }else {
                System.out.println("¡¡SALDO NO DISPONIBLE...!! ");
            }
        }else if (opciones.equals("3")){
            System.out.println("Su Saldo Actual es : " + saldo);
        }else if (opciones.equals("4")){
            System.out.println("¡¡GRACIAS POR SU PREFERENCIA!!");
            System.exit(0);
        }else{
            System.out.println("¡¡OPERACION NO ENCONTRADA!!");
            System.exit(1);
        }

        return NuevoSaldo;
    }
}
