import java.io.UnsupportedEncodingException;

import org.loon.test.encoding.ParseEncoding;

public class TE {
	public static void main(String[] args) {
		ParseEncoding parse;
		parse = new ParseEncoding();
		System.out.println("�й���½��");
		System.out.println("�����ַ����������ʽ=" + parse.getEncoding("?��?����?��??????????1 ".getBytes()));
		/*System.out.println("����վ�㣬�����ʽ="
				+ parse.getEncoding("http://www.baidu.com"));
		System.out.println();
		System.out.println("�й�̨�壺");
		System.out
				.println("�����ַ����������ʽ=" + parse.getEncoding("起步X5取回密码 ".getBytes()));
		System.out.println("����վ�㣬�����ʽ="
				+ parse.getEncoding("http://tw.yahoo.com/"));
		System.out.println("����վ��(�����֣�UTF����)�������ʽ="
				+ parse.getEncoding("http://www.javaworld.com.tw/jute"));
		System.out.println();
		System.out.println("�ձ���");
		System.out
				.println("�����ַ����������ʽ=" + parse.getEncoding("起步X5取回密码 ".getBytes()));
		System.out.println("����վ�㣬�����ʽ="
				+ parse.getEncoding("http://www.4gamer.net"));
		System.out.println();
		System.out.println("�Գ���Ⱥ����Ⱥ������");
		System.out.println("����վ�㣬�����ʽ="
				+ parse.getEncoding("http://www.easyjava.co.kr/"));*/
		try {
			System.out.println(new String(new String("�����ʼ�����".getBytes("utf-8"),"ISO8859-1")));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
