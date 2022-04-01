package Banco;

import java.util.Scanner;

public class Cliente{
    private int dni;
    
    private double sueldo;
    
   private Cuenta c1=new Cuenta(); 
    
    public Cliente(int dni, double sueldo){
        this.dni=dni;
        this.sueldo=sueldo;
        c1=new Cuenta(dni, sueldo, dni);
    }
    public Cliente(int dni, double sueldo, int numero_cuenta, double saldo, int contraseña){
        this.dni=dni;
        this.sueldo=sueldo;
        c1=new Cuenta(numero_cuenta, saldo, contraseña);
    }
    
    public String getDni(){
        return "El dni es "+dni;
    }
    public String getSueldo(){
        return "El sueldo es de "+sueldo;
    }
    public void setDni(int dni){
        String x = Integer. toString(dni);
        if(x.length()==8){
            this.dni=dni;
        }
    }
    public void setSueldo(double sueldo){
        if(sueldo>0){
           this.sueldo=sueldo; 
        }else{
            System.out.println("Este sueldo no es valido");
        }
    }
    public void ingresa_nomina(){
        c1.ingreso(sueldo);
    }
    public void sacar_dinero(int dni, int contraseña){
        Scanner sc=new Scanner(System.in);
        if(c1.validar_contraseña(contraseña) && this.dni==dni){
            System.out.println("Cuanto dinero quieres sacar");
            double sacar=sc.nextDouble();
            c1.sacar(sacar);
        }else{
            System.out.println("La contraseña o el dni no son correctos");
        }
        
        
    }
    public void mostrarDatos(int contraseña){
        System.out.println(c1.mostrar_datos(contraseña));
    }
    public void cambi_contra(){
        c1.modificar_contrasehna();
    }
    
    
}
