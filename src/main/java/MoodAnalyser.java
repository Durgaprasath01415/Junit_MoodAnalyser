public class MoodAnalyser {
public String analyserMood(String message){
    if(message.contains("This is a sad message"))
        return "SAD";
    else
    return "Happy";
}
}
