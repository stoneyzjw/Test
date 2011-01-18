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
		System.out.println("解析器调用了：warning()方法");
		System.out.println("发生错误的行：" + exception.getLineNumber());
		System.out.println("错误URI：" + exception.getSystemId());
		System.out.println("错误信息：" + exception.getMessage());
		System.out.println("============================================================");
	}

	@Override
	public void error(SAXParseException exception) throws SAXException
	{
		// TODO Auto-generated method stub
		System.out.println("解析器调用了：error()方法");
		System.out.println("发生错误的行：" + exception.getLineNumber());
		System.out.println("错误URI：" + exception.getSystemId());
		System.out.println("错误信息：" + exception.getMessage());
		System.out.println("============================================================");

	}

	@Override
	public void fatalError(SAXParseException exception) throws SAXException
	{
		// TODO Auto-generated method stub
		System.out.println("解析器调用了：fatalError()方法");
		System.out.println("发生错误的行：" + exception.getLineNumber());
		System.out.println("错误URI：" + exception.getSystemId());
		System.out.println("错误信息：" + exception.getMessage());
		System.out.println("============================================================");

	}

}
