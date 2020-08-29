package downloader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class App {
  public static void main(String[] args) throws MalformedURLException {
    URL url = new URL("http://www.google.com/");

    DownloaderBetter dwder;
    try {
      dwder = new DownloaderBetter(url, "test.html");
      dwder.run();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}