package com.buffer.reader;

public class Test {

	public static void main(String[] args) {
		
		String st1 = "";
			//System.out.println(st1);
			
		for (int i = 0; i < 10; i++) {
			st1 += "java";
			//System.out.println(st1);
			}
			
			System.out.println(st1);
			
			System.out.println("test");
		/*
		 * string += "hello";
		 * �Ĺ����൱�ڽ�ԭ�е�string����ָ��Ķ�������ȡ����"java"���ַ�����Ӳ����ٴ����һ���µ�String�����У�
		 * ����string����ָ�������ɵĶ���
		 * 
		 * javac Ĭ�Ͻ��ַ���ƴ�� ��StringBuilderʵ�� 
		 * new��һ��StringBuilder����Ȼ�����append���������ͨ��toString��������String����
		 */
		
		/*StringBuilder a = new StringBuilder(st1);
		a.append("hello");
		st1 = a.toString();
		System.out.println(st1);*/
		
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sBuilder.append("java");}
			System.out.println(sBuilder)
			;
		//new����ֻ������һ�Σ�ֻ������һ������append��������ԭ�ж���Ļ����Ͻ��еġ���δ�����ռ����ԴҪ������С�ö�	
	
	
			/*String sa = new String("Hello world");            
			String sb = new String("Hello world");      
			System.out.println(sa==sb);  
			
			
			String sc = "Hello world";    
			String sd = "Hello world";  
			System.out.println(sc==sd);   */

			/*sa,sb�д洢����JVM�ڶ���new����������String������ڴ��ַ��
			��Ȼ������String�����ֵ(char[]��ŵ��ַ�����)����"Hello world"�� 
			���"=="�Ƚϵ���������ͬ�Ķѵ�ַ��*/
	
			//�ֲ�����sc,sd�д洢��Ҳ�ǵ�ַ����ȴ���ǳ�������"Hello world"ָ��Ķѵ�Ψһ���Ǹ��ַ�������ĵ�ַ ,��Ȼ����ˡ�			
	
			  
			String sa = "ab";                                          
			String sb = "cd";                                       
			String sab = sa+sb;                                      
			String s = "abcd";  
			System.out.println(sab==s);  
			
			String sc = "ab"+"cd";  
			String sd = "abcd";  
			System.out.println(sc==sd);  
	
			/*�оֲ�����sa,sb�洢���Ƕ��������ַ�������ĵ�ַ��
			����ִ��sa+sbʱ��JVM���Ȼ��ڶ��д���һ��StringBuilder�࣬ͬʱ��saָ����ַ���������ɳ�ʼ����
			Ȼ�����append������ɶ�sb��ָ����ַ����ĺϲ�������
			���ŵ���StringBuilder��toString()�����ڶ��д���һ��String����
			��󽫸����ɵ�String����Ķѵ�ַ����ھֲ�����sab�С����ֲ�����s�洢���ǳ�������"abcd"����Ӧ���ַ����ĵ�ַ�� 
			sab��s��ַ��Ȼ��һ���ˡ���*/
	
			/*"ab"+"cd"��ֱ���ڱ����ھͺϲ��ɳ���"abcd"�� 
			�����ͬ����ֵ����"abcd"����Ӧ����ͬһ���ַ���������Ȼ��ַҲ����ͬ��*/
	
	}

	
	 












}


