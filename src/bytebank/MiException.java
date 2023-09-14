package bytebank;

//Errores son al nivel de jvm de java osea el programador no tiene control
//Excepciones son al nivel de codigo de la clase de java, el programador tiene control de las excepciones
public class MiException extends Exception{ 
//RuntimeException => puede que se lance una excepcion
//Exception => se va la lanzar la excepcion
    public MiException(){
        super();
    }
    
    public MiException(String message){
        super(message);
    }
}
