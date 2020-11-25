package crawler;

public class BaomoiCrawler extends Crawler {
	public BaomoiCrawler() {
		LINK = "https://baomoi.com";
		GET_IN_TAG = "<h4 class=\"story__heading\"><a href=\"(.*?)\"";
	}
	
	@Override
	public String setSubPageLink(String linktail) {
		return LINK+linktail;
	}
}
