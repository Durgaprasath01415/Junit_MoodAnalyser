public class MoodAnalyser {
public String analyserMood(String message){
    if(message.contains("SAD"))
        return "SAD";
    else
    return "Happy";
}
}
