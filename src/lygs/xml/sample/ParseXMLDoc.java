package lygs.xml.sample;
import java.io.*;
import org.xml.sax.*;
import org.xml.sax.helpers.XMLReaderFactory;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class ParseXMLDoc
{
	private static final Logger logger = LoggerFactory.getLogger(ParseXMLDoc.class);

	public void ShowParseResult(String uri)
	{
		
		logger.info("���� " + uri + " �ļ���");
		System.out.println("================================================================================");
		ContentHandler chandler = new CHandlerClass();
		ErrorHandler ehandler = new EHandlerClass();
		try
		{
			XMLReader myParser = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
			myParser.setContentHandler(chandler);
			myParser.setErrorHandler(ehandler);
			myParser.parse(uri);
		}
		catch (IOException e)
		{
			logger.info("���ļ�����");
		}
		catch (SAXException e)
		{
			logger.info("�����ļ�����");
		}
	}
	
	public static void main(String[] args)
	{
		String uri = ParseXMLDoc.class.getClassLoader().getResource(args[0]).toString();
		ParseXMLDoc parseXMLInstance = new ParseXMLDoc();
		parseXMLInstance.ShowParseResult(uri);
	}
}
