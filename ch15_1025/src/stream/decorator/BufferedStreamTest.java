package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 자동임포트 컴파일러가 권해줌
// 단축키 ctrl + shift + o(영문자)

public class BufferedStreamTest {

	public static void main(String[] args) {

		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("output2.txt"); // 입력 순서 기반 스트림을 먼저 열고
				FileOutputStream fos = new FileOutputStream("copy3.txt"); 
				BufferedInputStream bis = new BufferedInputStream(fis);  // 보조 스트림에 1번의 기반 스트림을 담기.(매개변수로 사용)
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
		
			millisecond = System.currentTimeMillis();
			
			int i;
			while( ( i = bis.read()) != -1){
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일 복사 하는 데 " + millisecond + " milliseconds 소요되었습니다.");
	}
}
