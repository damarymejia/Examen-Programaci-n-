
public abstract class OperaBanc 
{
    protected String nombre;

    public OperaBanc(String nombre)
    {
       this.nombre = nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public abstract double CPago();
}
