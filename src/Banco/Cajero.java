package Banco;

import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cliente c1=new Cliente(987654, 1200, 123456789, 15000, 987654);
        System.out.println("CAJERO AUTOMÁTICO\n" 
                +"---------------------------\n" 
                +"1. Consultar/Modificar Datos personales\n" 
                +"2. Ingresar Nomina\n" 
                +"3. Consultar Datos Bancarios\n" 
                +"4. Sacar Dinero\n" 
                +"5. Modificar Contraseña\n" 
                +"6. Salir");
        
        int opc=sc.nextInt();
        switch(opc){
            case 1 -> {
                System.out.println(c1.getDni()+" "+c1.getSueldo()+"\nDesea realizar un cambio");
                char op=sc.next().charAt(0);
                if(op=='s'){
                    System.out.println("Dime el dni");
                    c1.setDni(sc.nextInt());
                    System.out.println("Dime el suldo");
                    c1.setSueldo(sc.nextDouble());
                }
            }
            case 2 -> c1.ingresa_nomina();
            case 3 -> {
                System.out.println("Introduce la contraseña");
                c1.mostrarDatos(sc.nextInt());
            }
            case 4 -> {
                System.out.println("Dime el dni");
                int dni=sc.nextInt();
                System.out.println("Dime la contraseña");
                int contrasena=sc.nextInt();
                c1.sacar_dinero(dni, contrasena);
            }
            case 5 -> c1.cambi_contra();
            case 6 -> {
            }
        }
        
    }
}
