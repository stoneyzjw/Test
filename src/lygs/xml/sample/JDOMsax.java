package lygs.xml.sample;
import java.io.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;

public class JDOMsax
{
	private static final Logger logger = LoggerFactory.getLogger(JDOMsax.class);
	
	public void saxDoc(String fileName, OutputStream out) throws IOException, JDOMException
	{
		SAXBuilder builder = new SAXBuilder("org.apache.xerces.parsers.SAXParser", false);
		Document doc = builder.build(fileName);
		Format format = Format.getCompactFormat();
		format.setEncoding("GBK");
		format.setIndent("  ");
		XMLOutputter xmlOut = new XMLOutputter(format);
		xmlOut.output(doc, out);
	}

	public static void main(String[] args)
	{
		try
		{
			JDOMsax JDOMsaxInstance = new JDOMsax();
			System.out.println("======================================================================");
			System.out.println("Now we load XML document from existing file using SAX ....");
			System.out.println("======================================================================");
			String fileName = JDOMsax.class.getClassLoader().getResource(args[0]).toString();
			//logger.info(fileName);
			JDOMsaxInstance.saxDoc(fileName, System.out);
			System.out.println("======================================================================");
		}
		catch (Exception e)
		{
			logger.info("½âÎö³ö´íÁË£¡");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
