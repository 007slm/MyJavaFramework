

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;


public class Dom4jNewLine {
	public static void main(String[] args) throws Exception {
		Document doc =DocumentHelper.createDocument();
		Element ele =doc.addElement(new QName("content"));
		ele.setText("aaaa&#10;rbbb");
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("test.cache"), "UTF-8");
		System.out.println(doc.asXML());
		XMLWriter writer = new XMLWriter(osw,OutputFormat.createPrettyPrint());
		writer.setEscapeText(false);
		writer.write(doc);
		writer.close();
	}
}
