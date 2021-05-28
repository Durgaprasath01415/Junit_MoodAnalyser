public class InvalidMoodAnalysiseException extends RuntimeException{
    String message;
    public InvalidMoodAnalysiseException(String message){
        super(message);
        this.message = message;
    }
}
