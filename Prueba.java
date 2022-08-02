
 import java.util.Scanner;
 import java.util.InputMismatchException;
 
 public class Prueba{
     public static void main(String[]args){
         Scanner input = new Scanner(System.in);
         PagoAgua obj=new PagoAgua("Meliza", 2);

         boolean salir = false;
         int res;
 
         while(!salir) {
            System.out.println("---Accion que desea Realizar---");
             System.out.println("1. Pago de cable");
             System.out.println("2. Pago de Agua");
             System.out.println("3. Salir");
 
             try{
 
                     System.out.println("Accion Numero: ");
                     res = input.nextInt();
                     
                     switch(res){
                         case 1:
                         Servicio_Cable();

                             break;
                         
                         case 2:
                         obj.Imprimir();
                             break;
  
                         case 3:
                         salir = true;
                             break;
 
                         default:
                         System.out.println("Numero del 1 al 3");
                     }
 
                 }
             catch(InputMismatchException e){
                 System.out.println("Debes ser un numero valido");
                 input.next();
             }
         }
       
     }
     public static void Servicio_Cable()
     {
        PagoCable Pagoc = new PagoCable("Meliza", 500);
        
        System.out.printf("Nombre: %s%nEl Total a pagar es: %d%n%n%n",Pagoc.getNombre(),Pagoc.getPCable());
     }
 
}