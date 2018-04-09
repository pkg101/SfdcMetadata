package metadataResources;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XmlDocumetRes {
	public static File xmlDocEnd(Document doc, Element xmlroot) throws TransformerException {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		doc.getDocumentElement().normalize();
		NodeList nList = doc.getElementsByTagName("types");
		if (nList.getLength() != 0) {
			/*Attr attrType = doc.createAttribute("xmlns");
			attrType.setValue("http://soap.sforce.com/2006/04/metadata");
			xmlroot.setAttributeNode(attrType);*/
			File targetFile = new File("/app/metadataxml/metadata_"
					+ (new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss").format(new Date()).toString()) + ".xml");
			StreamResult result = new StreamResult(targetFile);
			transformer.transform(source, result);
			return targetFile;
		} else
			return null;
	}

}
