import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PathServiceTest {
  @Test
  void testFilePath() {
    PathService service = new PathService();
    String result = service.getProjectFilePath("data", "config.txt");
    // Bài test này sẽ FAIL trên Ubuntu và macOS vì chúng dùng dấu /
    assertTrue(result.contains("\\"));
  }
}