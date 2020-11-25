package crawler;

public class Vietnamnet extends Crawler{
	public Vietnamnet() {
		LINK = "https://vietnamnet.vn";
		GET_IN_TAG = "><a href=\"(.*?)\"";
	}
	
	@Override
	public String setSubPageLink(String linktail) {
		return LINK + linktail;
	}
}
