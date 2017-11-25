package com.cenfotec.develectronicos.entities;

import java.time.LocalDateTime;
import java.util.Vector;

public abstract class Tramite {
	/* date/time a document was created*/
	public abstract LocalDateTime getCreated();
	
	 /* names of the people who have saved a document.*/
	public abstract Vector<String> getAuthors();
	
	/* is a response to another document */
	public abstract boolean isResponse();
	
	/* indicates whether a document is encrypted.*/
	public abstract boolean isEncrypted();
	
	/* creates a new document that is formatted as a reply to the current document.*/
	public abstract Tramite createReplyMessage();
	
	/* Marks the document as read.*/
	public abstract void markRead(final String username);
	
	/* saves any changes you have made to a document*/
	public abstract boolean save();
	
	/* */
	public abstract void setEncrypted();
	
	/* encrypts a document.*/
	public abstract void encrypt();
	
	/* decrypt a document.*/
	public abstract void decrypt();

}
