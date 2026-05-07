public class PathService {
  // Co tinh dung dau \\ de sai doi voi linux va macos
  public String getProjectFilePath(String folder, String file) {
    return folder + "\\" + file;
  }
}