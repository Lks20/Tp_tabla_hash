import java.util.*;
public class casarural {    
    private String codigo;
    private String poblacion;
    private String direccion;
    private int numHabitacion=0;
    private double precio=0.0;
    boolean esAlta;
    
    public casarural(){
        esAlta=true;
        asigna();
    }
    public void asigna(){
      Scanner sc=new Scanner(System.in) ; 

      System.out.print("\n Codigo (10 caracteres): ");
      codigo=sc.nextLine();
      System.out.print("\n Poblacion: ");
      poblacion=sc.nextLine();
      System.out.print("\n Direccion: ");
      direccion=sc.nextLine();
      System.out.print("\n Numero de habitaciones: ");
      numHabitacion=sc.nextInt();
      System.out.print("\n Precio por dia de estacia: ");
      precio=sc.nextDouble();
    }
    public String elCodigo(){
        return codigo;
    }
    public void muestra(){
        System.out.println("\n Casa Rural " + codigo);
        System.out.println("\n Numero de Habitaciones: "+numHabitacion);
        System.out.println("Población: " + poblacion);
        System.out.println("Dirección: " + direccion);
        System.out.println("Precio por día: " + precio);
    }

}



