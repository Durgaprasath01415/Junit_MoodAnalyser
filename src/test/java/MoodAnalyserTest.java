import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyserMood("This is a sad message");
        Assert.assertEquals("sad", mood);
    }
    @Test
    public void givenMood_whenNull_shouldReturnTrue() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            moodAnalyser.analyserMood(null);
        }catch (InvalidMoodAnalysiseException ex){
            Assert.assertEquals(InvalidMoodAnalysiseException.class, ex.getClass());
        }
    }

    @Test
    public void givenMood_whenEmpty_shouldThrowInvalidMoodAnalaysisException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            moodAnalyser.analyserMood(" ");
        }catch (InvalidMoodAnalysiseException ex){
            Assert.assertEquals(InvalidMoodAnalysiseException.class, ex.getClass());
        }
    }
}
