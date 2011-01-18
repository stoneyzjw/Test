package lygs.xml.sample;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class EHandlerClass implements ErrorHandler
{

	@Override
	public void warning(SAXParseException exception) throws SAXException
	{
		// TODO Auto-generated method stub
		System.out.println("�����������ˣ�warning()����");
		System.out.println("����������У�" + exception.getLineNumber());
		System.out.println("����URI��" + exception.getSystemId());
		System.out.println("������Ϣ��" + exception.getMessage());
		System.out.println("============================================================");
	}

	@Override
	public void error(SAXParseException exception) throws SAXException
	{
		// TODO Auto-generated method stub
		System.out.println("�����������ˣ�error()����");
		System.out.println("����������У�" + exception.getLineNumber());
		System.out.println("����URI��" + exception.getSystemId());
		System.out.println("������Ϣ��" + exception.getMessage());
		System.out.println("============================================================");

	}

	@Override
	public void fatalError(SAXParseException exception) throws SAXException
	{
		// TODO Auto-generated method stub
		System.out.println("�����������ˣ�fatalError()����");
		System.out.println("����������У�" + exception.getLineNumber());
		System.out.println("����URI��" + exception.getSystemId());
		System.out.println("������Ϣ��" + exception.getMessage());
		System.out.println("============================================================");

	}

}
