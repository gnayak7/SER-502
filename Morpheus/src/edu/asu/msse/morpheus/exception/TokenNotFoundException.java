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

package edu.asu.msse.morpheus.exception;

public class TokenNotFoundException extends Exception {

	public TokenNotFoundException() {
		super();
	}
	
	public TokenNotFoundException(String message) {
		super(message);
		System.out.println("Could not parse input" + message);
	}
}
