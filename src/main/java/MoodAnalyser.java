public class MoodAnalyser {
    public String analyserMood(String message) {
        try {
            if (message.contains("This is a sad message"))
                return "sad";
        } catch (NullPointerException ex) {
            return "happy";
        }
        return "happy";
    }
}