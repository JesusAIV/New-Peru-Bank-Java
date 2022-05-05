package models;
import java.util.Scanner;

public class cliente {

    public String dni;
    private String password;
    public String usuario;
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public cliente(){

    }
    public cliente(String Dni, String Password, String Usuario){
        this.dni = Dni;
        this.password = Password;
        this.usuario = Usuario;
    }
    public boolean Validator(String[] dni, String[] password, String[] user){
        Scanner sc = new Scanner(System.in);
        
                
        System.out.print("Ingrese DNI: ");
        String Dni = sc.nextLine();

        System.out.print("Ingrese Contraseña: ");
        String Password = sc.nextLine();
        
        boolean validador = false;

        for (int i = 0; i < dni.length; i++){
            if (Dni.equals(dni[i]) && Password.equals(password[i])){
                validador = true;
                this.usuario = user[i];
                break;
            }else{
                validador = false;
            }
        }
        if (validador == true){
            System.out.println("\n¡¡BIENVENIDO " + usuario + "!!");
        }
        return validador;
    }

}