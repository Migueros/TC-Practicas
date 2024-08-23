public class Run {
    public static void main(String[] args) {
        EdadException exPersonalizada = new EdadException();

        try{
            exPersonalizada.validadEdad(17);
        }catch(EdadException ex){
            System.err.println("Se ejecuto la exception personalizada, mensaje de la excepcion"+ex.getMessage());
            //ex.printStackTrace();
        }catch(Exception ex){
            System.err.println("Exception por default");
        }
    }
}
