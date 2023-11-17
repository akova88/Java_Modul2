package Structural_Design_Pattern.facade.bt;

public class FileDownloaderProxy implements Downloader{
    private FileDownloader fileDownloader;

    public FileDownloaderProxy() {
        this.fileDownloader = new FileDownloader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:97.0) Gecko/20100101 Firefox/97.0");
    }

    @Override
    public void download(String url, String destination) {
        fileDownloader.download(url, destination);
    }
}
