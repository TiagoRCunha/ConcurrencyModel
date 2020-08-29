package downloader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class App {
  public static void main(String[] args) throws MalformedURLException {
    try {
      URL url = new URL("http://www.google.com/");
      Downloader downloader = new Downloader(url, "test.html");
      downloader.run();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}