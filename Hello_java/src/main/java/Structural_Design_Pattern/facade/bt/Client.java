package Structural_Design_Pattern.facade.bt;

public class Client {
    public static void main(String[] args) {
        Downloader downloader = new FileDownloaderProxy();
        downloader.download("https://cinestar.com.vn/pictures/Cinestar/04-2023/the-first-slam-dunk.jpg", "D:/Soft/the-first-slam-dunk.jpg");
    }
}
