package com.beuffer.demo;

import java.io.*;

public class BufferDemo {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C:/Users/Mrinu/Test.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

//		int x;
//		while ((x = bis.read()) != -1) {
//			System.out.print((char) x);
//		}

		/**
		 *Buffer is true because buffer is a temporary memory area for holding the data.
		 *So if there is a difference in the speed in between the device and the program, then we use buffer.
		 *Like if we watch any video online, like on YouTube. If your watching a video, it will first 
		 *try to pull some video part of a video and put it in a buffer to make sure that a video can
		 *be played smoothly. So while its playing it's also loading the rest of the video inside and keeping 
		 *it inside a buffer.So if there is a trouble in buffering, then we say reduce buffering.
		 *So it will keep the data in the buffer, so that smoothly can be used. So that's the benefit of
		 *buffer, so the data is there in the buffer therefore mark and reset is supported.
		 *It's not supported on the file because files just like audio tapes. Head will just move forwards 
		 *and you cannot the head move backward, you can rewind. But you cannot read backward. 
		 *In our computer system file system works in the same way only.It will move only in the forward 
		 *direction, you cannot move it back to few bytes. If you want , we need BUFFERSTREAM.    
		 */
		
		System.out.println("File " + fis.markSupported());
		System.out.println("Buffer " + bis.markSupported()); // On buffer mark is supported.

	}

}
