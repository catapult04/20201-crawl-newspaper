package crawler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		VnexpressCrawler v = new VnexpressCrawler();
		v.crawlData();
		BaomoiCrawler b = new BaomoiCrawler();
//		b.crawlData();
		Vietnamnet vnet = new Vietnamnet();
//		vnet.crawlData();
	}
}
