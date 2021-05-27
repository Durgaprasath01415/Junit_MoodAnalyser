import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis() {
       MoodAnalyser moodAnalyser = new MoodAnalyser();
       String mood = moodAnalyser.analyserMood("This is a sad message");
       Assert.assertTrue(mood , true);
    }
}
