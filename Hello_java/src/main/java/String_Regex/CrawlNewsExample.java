package String_Regex;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNewsExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            content = content.replaceAll("\\n", "");
//            <article class="article-item" data-content-name="category-highlights" data-content-piece="category-highlights-position_3" data-content-target="/the-gioi/vu-khi-khong-thuoc-no-cua-nga-co-the-khien-ukraine-mat-hang-nghin-uav-20230524142858491.htm" data-track-content=""><div class="article-thumb"><a href="/the-gioi/vu-khi-khong-thuoc-no-cua-nga-co-the-khien-ukraine-mat-hang-nghin-uav-20230524142858491.htm"> <img alt="&quot;Vũ khí không thuốc nổ&quot; của Nga có thể khiến Ukraine mất hàng nghìn UAV" height="168" src="https://icdn.dantri.com.vn/zoom/252_168/2023/05/24/32248312613512521656909944476029396117675950n-1672360195092-crop-1684913236937.jpeg" srcset="https://icdn.dantri.com.vn/zoom/252_168/2023/05/24/32248312613512521656909944476029396117675950n-1672360195092-crop-1684913236937.jpeg 1x, https://icdn.dantri.com.vn/zoom/504_336/2023/05/24/32248312613512521656909944476029396117675950n-1672360195092-crop-1684913236937.jpeg 2x" width="252"> </a></div><h3 class="article-title"><a href="/the-gioi/vu-khi-khong-thuoc-no-cua-nga-co-the-khien-ukraine-mat-hang-nghin-uav-20230524142858491.htm">"Vũ khí không thuốc nổ" của Nga có thể khiến Ukraine mất hàng nghìn UAV</a></h3></article>
            Pattern p = Pattern.compile("<h3 class=\\\"article-title\\\"><a href=\\\".*?\\\">(.*?)</a></h3>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
