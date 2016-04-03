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
 * Purpose: 
 *
 * @author Gowtham Nayak
 * @version January 2016
 */

package edu.asu.msse.morpheus.tokenizer;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.asu.msse.morpheus.exception.TokenNotFoundException;

public class Tokenizer {
	private ArrayList<TokenIdentifier> listTokenIdentifier;
	private String inputString;

	private Token lastToken;
	private boolean pushBack;

	/**
	 * Constructor fot Tokenizer
	 * 
	 * @params string The input code given by the user
	 * @returns Token
	 * 
	 */
	public Tokenizer(String inputString) {
		this.inputString = inputString;		
		this.listTokenIdentifier = new ArrayList<>();
		buildTokenIdentifierArrayList();
	}

	/**
	 * Adds all the necessary patterns to the array list. 
	 */
	public void buildTokenIdentifierArrayList() {
		/**
		 * Maintain the order while adding. Give it in a greedy way. The most specific to most common. Eg: DECIMAL Should 
		 * be added first then INTEGER else INTEGER will be matched first and '.' will be matched as a TOKEN and then
		 * the succeeding number will be parsed as an INTEGER
		 */
		listTokenIdentifier.add(new TokenIdentifier(Pattern.compile(RegularExpression.DECIMAL), TokenType.DECIMAL_LITERAL));
		listTokenIdentifier.add(new TokenIdentifier(Pattern.compile(RegularExpression.IDENTIFIER), TokenType.IDENTIFIER));
		listTokenIdentifier.add(new TokenIdentifier(Pattern.compile(RegularExpression.INTEGER), TokenType.INTEGER_LITERAL));
		listTokenIdentifier.add(new TokenIdentifier(Pattern.compile(RegularExpression.STRING), TokenType.STRING_LITERAL));

		for (String t: new String[] {"=", "\\(","\\)", "\\.","\\,"}) {
			listTokenIdentifier.add(new TokenIdentifier(Pattern.compile("^(" + t + ")"), TokenType.TOKEN));	
		}
	}

	/**
	 * Returns the next token in the list.
	 * @throws TokenNotFoundException 
	 * 
	 * @returns Token.
	 */

	public Token nextToken() throws TokenNotFoundException {

		inputString = inputString.trim();

		if (pushBack) {
			pushBack = false;
			return lastToken;
		}

		if (inputString.isEmpty()) {
			return new Token("", TokenType.EMPTY);
		}

		for (TokenIdentifier tokenIdentifier: listTokenIdentifier) {
			Matcher matcher = tokenIdentifier.getPattern().matcher(inputString);

			if (matcher.find()) {
				String token = matcher.group().trim();
				inputString = matcher.replaceFirst("");

				if (tokenIdentifier.getType() == TokenType.STRING_LITERAL){
					lastToken = new Token(token.substring(1, token.length()-1), TokenType.STRING_LITERAL);
					return lastToken;
				} else {
					lastToken =  new Token(token, tokenIdentifier.getType());
					return lastToken;
				}				
			}
		}
		// If token not matched by any token patterns
		throw new TokenNotFoundException(inputString);
	}
	
	/**
	 * Checks if there are more tokens.
	 * 
	 * 
	 * @return boolean True if there are tokens False otherwise.
	 */

	public boolean hasNextToken() {
		return !inputString.isEmpty();
	}

	public void pushBack() {
		if (lastToken != null) {
			this.pushBack = true;
		}
	}
}
