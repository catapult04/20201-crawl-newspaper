package crawler;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Crawler {
	public String LINK;
	public String GET_IN_TAG;
	
    public static String getContentFrom(String link) throws IOException {
        // Gởi HTTP request và nhận về kết quả là chuỗi các thẻ HTML
        URL url = new URL(link);
        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\\\Z");
        String content = scanner.next();
        scanner.close();
        // xoá các ký tự ngắt dòng (xuống dòng)
        content = content.replaceAll("\\\\R", "");
        return content;
    }
    
    public void crawlData() {
    	try{
			String homePageLink = this.LINK;
			String homePageHTML = Crawler.getContentFrom(homePageLink);
	        Pattern plink = Pattern.compile(this.GET_IN_TAG), p;
	        Matcher mlink = plink.matcher(homePageHTML), m;
	        
	        System.out.println(homePageHTML);
	        int count = 0;
	        String subPageLink, subPageHTML, title="", summ="", para="";
	        while (mlink.find()) {
	        	count++;
	            subPageLink = setSubPageLink(mlink.group(1));
	            try {
	            	subPageHTML = Crawler.getContentFrom(subPageLink);
		            System.out.println(subPageLink);
	            } catch(Exception e) {
	            	System.out.println("ERROR: " + subPageLink);
	            }
	            
	            
	            //find title
//	            p = Pattern.compile(">\"(.*?)\"</h1>");
//	            m = p.matcher(subPageHTML);
//	            if(m.find()) title.concat(m.group(1));
//	            title="";
//	            
//	            //find summ
//	            
//	            //find para
//	            p = Pattern.compile(">\"(.*?)\"</p>");
//	            m = p.matcher(subPageHTML);
//	            while(m.find()) {
//	            	para.concat(m.group(1));
//	            }
//	            para="";
	            //finish find elements
	            
//	            System.out.println(title);
//	            System.out.println(para);
	        }
	        
	        System.out.println("FINISH!  count = " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public String setSubPageLink(String linktail) {
    	return "";
    }
}