public class EdadException extends Exception{

    public EdadException(){

    }

    public EdadException(String mensaje){
        super(mensaje);
    }
    
    public void validadEdad(int edad) throws EdadException{
        if(edad<18 && edad >=0)
        {
            throw new EdadException("Error de edad");
        }
    }
}