package lygs.xml.sample;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class CHandlerClass implements ContentHandler
{
	
	private static final Logger logger = LoggerFactory.getLogger(CHandlerClass.class);
	
	private Locator locator;

	@Override
	public void setDocumentLocator(Locator locator)
	{
		// TODO Auto-generated method stub
		System.out.println("解析器调用了：setDocumentLocator()");
		this.locator = locator;
		System.out.println("==============================");
	}

	@Override
	public void startDocument() throws SAXException
	{
		// TODO Auto-generated method stub
		System.out.println("解析器调用了：startDocument()");
		System.out.println("==============================");
	}

	@Override
	public void endDocument() throws SAXException
	{
		// TODO Auto-generated method stub
		System.out.println("解析器调用了：endDocument()");
		System.out.println("==============================");
	}

	@Override
	public void startPrefixMapping(String prefix, String uri)
			throws SAXException
	{
		// TODO Auto-generated method stub
		System.out.println("解析器调用了：startPrefixMapping()");
		System.out.println("Prefix: [" + prefix + "] uri: [" + uri + "]");
		System.out.println("==============================");

	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException
	{
		// TODO Auto-generated method stub
		System.out.println("解析器调用了：endPrefixMapping()");
		System.out.println("Prefix: [" + prefix + "]");
		System.out.println("==============================");

	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException
	{
		// TODO Auto-generated method stub
		System.out.println("解析器调用了：startElement()");
		if (uri.equals(""))
		{
			System.out.println("NamespaceURI: [" + uri + "] qName: [" + qName + "]");
		}
		else
		{
			System.out.println("没有namespace");
		}
		System.out.println("localName: [" + localName + "]");
		for (int i = 0; i< atts.getLength(); i++)
		{
			System.out.println("Attribute [" + atts.getLocalName(i) + "] is [" + atts.getValue(i) + "]");
		}
		System.out.println("==============================");

	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException
	{
		// TODO Auto-generated method stub
		System.out.println("解析器调用了：endElement()");
		System.out.println("localName: [" + localName + "]");
		System.out.println("==============================");

	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException
	{
		// TODO Auto-generated method stub
		String sss = new String(ch, start, length);
		System.out.println("解析器调用了：characters()");
		System.out.println("characters: [" + sss + "]");
		System.out.println("==============================");

	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length)
			throws SAXException
	{
		// TODO Auto-generated method stub
		String sss = new String(ch, start, length);
		System.out.println("解析器调用了：ignorableWitespace()");
		System.out.println("ignorableWhitespace: [" + sss + "]");
		System.out.println("==============================");

	}

	@Override
	public void processingInstruction(String target, String data)
			throws SAXException
	{
		// TODO Auto-generated method stub
		System.out.println("解析器调用了：processingInstruction()");
		System.out.println("Target: [" + target + "] Data: [" + data + "]");
		System.out.println("==============================");

	}

	@Override
	public void skippedEntity(String name) throws SAXException
	{
		// TODO Auto-generated method stub
		System.out.println("解析器调用了：skippedEntity()");
		System.out.println("skippedEntity is [" + name + "]");
		System.out.println("==============================");

	}

}
