package maievjava03_97;

import java.awt.PageAttributes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.print.DocFlavor.INPUT_STREAM;

public class maievjava03_97 {
	

	public static void main(String[] args) {
		
	}
	
	public static int[] maiev(int...number) {
		int p[]=new int[number.length];
		Arrays.sort(p);
		
		return p;
	}
	
}

class MyKey {
	private int key;

	public MyKey(int key) {
		this.key = key;
	}
}

class HelloA {
	public HelloA() {
		System.out.println("HelloA");
	}

	{
		System.out.println("I'm A class");
	}
	static {
		System.out.println("static A");
	}
}

class HelloB extends HelloA {
	public HelloB() {
		System.out.println("HelloB");
	}

	{
		System.out.println("I'm B class");
	}
	static {
		System.out.println("static B");
	}
}

class BaseException extends Exception {
}

class MyException extends BaseException {
}
interface Playable {
	 int playtime = 0;
	 void play();
	}
class Football implements Playable {
	 public void setPlayTime(int playtime) {
	playtime = playtime;
	 }
	 public void play() {
	 System.out.println("play football");
	 } }