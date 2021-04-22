import java.util.*;
public class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        tabla_dispersa tabla=new tabla_dispersa();
        casarural casa1=new casarural();
        tabla.insertar(casa1);
        String codigo;

        System.out.println("Ingrese la casa que desea buscar");
        codigo = sc.nextLine();
      try{
            casarural buscado = tabla.buscar(codigo);
            buscado.muestra();
        }
        catch(Exception e){
            System.out.println("La casa no existe");
        }
       
    
        System.out.println("Ingrese el codigo de la casa que desa eliminar");
        codigo=sc.nextLine();
        try{
            System.out.println("La casa Fue eliminada");
           tabla.eleminar(codigo); 
        }
        catch(Exception e){
            System.out.println("La casa no existe");
        }
        
    }
}