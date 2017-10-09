package jsoup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;






import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		
		Document document = Jsoup.connect("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population").get();
		
		Elements elements = document.select("table.wikitable > tbody > tr > td > a");
		
		List<Country> countries = new ArrayList<Country>();
				
		for(Element element: elements){
			
			if(element.attr("href").startsWith("/wiki/")){
				countries.add(new Country(element.attr("href").substring(6),0));
			}
			
//			System.out.println(element.text());
		}
	
		System.out.println();
		
		for (int i = 0; i< 15; i++){
			
			System.out.println(countries.get((int) (Math.random()*countries.size())));
		}
		
		
	}

}
