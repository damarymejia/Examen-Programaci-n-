import java.util.Scanner;

public class PagoAgua extends OperaBanc {
    private double metrosCubicos;

    public PagoAgua(String nombre, double metrosCubicos)
    {
        super(nombre);
        this.metrosCubicos = metrosCubicos;
    }
    
    public void metrosCubicos(double metrosCubicos)
    {
        this.metrosCubicos = metrosCubicos;

    }

    public double getMetrosCubicos()
    {
        return metrosCubicos;
    }

        public double CAgua()
        {
        double total;
        if(metrosCubicos <= 10){}
        total = metrosCubicos * 10;

        if(metrosCubicos >= 11 || metrosCubicos <=30)
        total = metrosCubicos * 12.50;

        if(metrosCubicos > 30)
        total = metrosCubicos * 15;   
        return total;

    }
    
        @Override
        public double CPago()
        {
            return CAgua();
        }
    
        public void Imprimir()
        {
            
           System.out.printf ("Nombre: %s%nEl total a pagar es de %d", nombre, CPago());
        }
    }
  



