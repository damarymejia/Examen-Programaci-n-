
public class PagoCable extends OperaBanc {

    private int PCable;
   
    public PagoCable( String nombre,int PCable)
    {
        super(nombre);
        this.PCable = PCable;
    }

    public void setPCable(int PCable)
    {
        this.PCable = PCable;
    }

    public int getPCable()
    {
        return PCable = 500;
    }

    @Override
    public double CPago()
    {
        return getPCable();
    }

    public String toPCable()
    {
        return String.format
        ("Propiedad: %s%n El pago es de: %d", nombre , getPCable());
    }
}