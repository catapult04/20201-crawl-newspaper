package crawler;

public class VnexpressCrawler extends Crawler{
	public VnexpressCrawler() {
		LINK = "https://vnexpress.net/";
		GET_IN_TAG = "><a href=\"(.*?)\"";
	}
	
	@Override
	public String setSubPageLink(String linktail) {    
		return linktail+"";
	}
}
