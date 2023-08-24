package _14_Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.NonWritableChannelException;
import java.security.KeyException;
import java.util.jar.JarException;

import javax.management.openmbean.KeyAlreadyExistsException;
import javax.naming.MalformedLinkException;

public class Demo3 {
	
	static void test() throws IOException, JarException, NonWritableChannelException, KeyAlreadyExistsException, KeyException, MalformedLinkException, BootstrapMethodError, CloneNotSupportedException, HandBroken {
		System.out.println("inside test method ...");
		throw new HandBroken("I hurt my hand...");
	}
	
	public static void main(String[] args) {
		try {
			int[] a = new int[999342342];
			test();
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Everything is perfect!");
	}
}
