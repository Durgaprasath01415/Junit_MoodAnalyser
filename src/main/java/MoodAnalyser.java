public class MoodAnalyser {

    public String analyserMood(String message) throws InvalidMoodAnalysiseException {
        try {
            if (message.contains("This is a sad message"))
                return "sad";
            if (message.contains(" "))
                throw new InvalidMoodAnalysiseException("Invalid Empty mood message");
        } catch (NullPointerException ex) {
            throw new InvalidMoodAnalysiseException("Invalid NULL mood.Please enter proper message");
        }
        return "happy";
    }
}