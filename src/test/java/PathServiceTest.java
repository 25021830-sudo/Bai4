import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathServiceTest {
  @Test
  void testFilePathCrossPlatform() {
    PathService service = new PathService();
    String result = service.getProjectFilePath("data", "config.txt");

    // ky vong ket qua khop he dieu hanh
    String expected = "data" + File.separator + "config.txt";

    assertEquals(expected, result, "Đường dẫn không tương thích với OS hiện tại!");
  }
}