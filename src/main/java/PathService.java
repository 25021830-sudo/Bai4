import java.nio.file.Path;
import java.nio.file.Paths;

public class PathService {
  public String getProjectFilePath(String folder, String file) {
    Path path = Paths.get(folder, file);
    return path.toString();
  }
}