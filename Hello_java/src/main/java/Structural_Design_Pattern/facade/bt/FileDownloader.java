package Structural_Design_Pattern.facade.bt;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader{
    String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(String url, String destination) {
        try {
            URL fileUrl = new URL(url);
            URLConnection connection = fileUrl.openConnection();
            connection.setRequestProperty("User-Agent", userAgent);

            try(InputStream in = connection.getInputStream();
                FileOutputStream out = new FileOutputStream(destination)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
