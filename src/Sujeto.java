import java.util.LinkedList;

public interface Sujeto{

    public void agregar(Persona p,  LinkedList<Persona> l);

    public void remover(Persona p, LinkedList<Persona> l);
    
    public void notificar(Persona p);

}
