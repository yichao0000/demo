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
		 * 的过程相当于将原有的string变量指向的对象内容取出与"java"作字符串相加操作再存进另一个新的String对象当中，
		 * 再让string变量指向新生成的对象。
		 * 
		 * javac 默认将字符串拼接 用StringBuilder实现 
		 * new出一个StringBuilder对象，然后进行append操作，最后通过toString方法返回String对象
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
		//new操作只进行了一次，只生成了一个对象，append操作是在原有对象的基础上进行的。这段代码所占的资源要比上面小得多	
	
	
			/*String sa = new String("Hello world");            
			String sb = new String("Hello world");      
			System.out.println(sa==sb);  
			
			
			String sc = "Hello world";    
			String sd = "Hello world";  
			System.out.println(sc==sd);   */

			/*sa,sb中存储的是JVM在堆中new出来的两个String对象的内存地址。
			虽然这两个String对象的值(char[]存放的字符序列)都是"Hello world"。 
			因此"=="比较的是两个不同的堆地址。*/
	
			//局部变量sc,sd中存储的也是地址，但却都是常量池中"Hello world"指向的堆的唯一的那个字符串对象的地址 ,自然相等了。			
	
			  
			String sa = "ab";                                          
			String sb = "cd";                                       
			String sab = sa+sb;                                      
			String s = "abcd";  
			System.out.println(sab==s);  
			
			String sc = "ab"+"cd";  
			String sd = "abcd";  
			System.out.println(sc==sd);  
	
			/*中局部变量sa,sb存储的是堆中两个字符串对象的地址。
			而当执行sa+sb时，JVM首先会在堆中创建一个StringBuilder类，同时用sa指向的字符串对象完成初始化，
			然后调用append方法完成对sb所指向的字符串的合并操作，
			接着调用StringBuilder的toString()方法在堆中创建一个String对象，
			最后将刚生成的String对象的堆地址存放在局部变量sab中。而局部变量s存储的是常量池中"abcd"所对应的字符串的地址。 
			sab与s地址当然不一样了。。*/
	
			/*"ab"+"cd"会直接在编译期就合并成常量"abcd"， 
			因此相同字面值常量"abcd"所对应的是同一个字符串对象，自然地址也就相同。*/
	
	}

	
	 












}


