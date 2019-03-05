package ApachePOI;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class Ecmm 
{
	public static void main(String[] args) 
	{
		try {

			File fXmlFile = new File("D:\\Automation IBR\\AUG2018_0416KP84.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
					
			//optional, but recommended
			//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();
					
			NodeList nList = doc.getElementsByTagName("urn:SAMGroupECMMRequest");
					
			

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);
						
				
						
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					
					System.out.println(eElement.getElementsByTagName("GroupName").item(0).getTextContent());
					
					System.out.println(eElement.getElementsByTagName("ConnectureID").item(0).getTextContent());
				}
			}
		    } catch (Exception e) {
			e.printStackTrace();
		    }
	}
}
