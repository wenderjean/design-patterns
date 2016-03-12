package com.patterns.chapter.three.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class LowerCaseInputStreamTest {

	@Test
	public void shouldConvertFileContentToLowerCase() {
		int c;
		StringBuilder result = new StringBuilder();
		try {
			String path = this.getClass().getClassLoader().getResource("").getPath();
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(path + "file.txt")));
			while ((c = in.read()) > 0) {
				result.append((char) c);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertThat(result.toString(), equalTo("yeap! it's me."));
	}
}
