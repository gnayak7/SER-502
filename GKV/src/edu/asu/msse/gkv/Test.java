package edu.asu.msse.gkv;
/**
 * Copyright 2016 Gowtham Nayak,
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Purpose: This is the starting point of the program
 *
 * @author Gowtham Nayak
 * @version April 2016
 */

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test {
	public static void main(String[] args) throws RecognitionException, IOException {
		ANTLRFileStream antlrFileStream = new ANTLRFileStream("Sample.gkv");
		CharStream charStream = new ANTLRStringStream();
		GKVLexer gkvLexer = new GKVLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(gkvLexer);
		GKVParser gkvParser = new GKVParser(tokenStream);
		gkvParser.program();
	      
		System.out.println("done");
	}
}
