package Version1.exceptions;

public class movieNotFoundException extends RuntimeException{
    public movieNotFoundException (String message){
        super(message);
    }
}
