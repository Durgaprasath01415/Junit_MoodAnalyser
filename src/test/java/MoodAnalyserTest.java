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
        String mood = moodAnalyser.analyserMood(null);
        Assert.assertEquals("happy", mood);
    }
}