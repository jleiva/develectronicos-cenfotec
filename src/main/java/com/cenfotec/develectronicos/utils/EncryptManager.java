package com.cenfotec.develectronicos.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Base64;
import java.util.Base64.Encoder;

import javax.crypto.Cipher;

public class EncryptManager {
	private final String KEY_EXTENSION = ".key";
	private final String PUB_KEY_SUFIX = "-public";
	private final String PRIV_KEY_SUFIX = "-private";
	private final String PUBLIC = "public";
	private final String PRIVATE = "private";
	private final String PATH_KEYSTORAGE = "/Users/jdleiva/develectronicos/keystorage/";
	
	public void createKey(String name) throws Exception {
		KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
		KeyFactory fact = KeyFactory.getInstance("RSA");
		kpg.initialize(2048);
		KeyPair kp = kpg.genKeyPair();
		RSAPublicKeySpec pub = fact.getKeySpec(kp.getPublic(), 
				RSAPublicKeySpec.class);
		RSAPrivateKeySpec priv = fact.getKeySpec(kp.getPrivate(), 
				RSAPrivateKeySpec.class);

		saveToFile(PATH_KEYSTORAGE + name + PUB_KEY_SUFIX + KEY_EXTENSION, pub.getModulus(), pub.getPublicExponent());
		saveToFile(PATH_KEYSTORAGE + name + PRIV_KEY_SUFIX + KEY_EXTENSION, priv.getModulus(), priv.getPrivateExponent());
	}
	
	public byte[] encryptMessage(String message, String keyName) throws Exception {
		PublicKey pubKey = (PublicKey)readKeyFromFile(keyName, PUBLIC);
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, pubKey);
		byte[] encryptedData = cipher.doFinal(message.getBytes(StandardCharsets.UTF_8));
		Encoder oneEncoder = Base64.getEncoder();
		encryptedData = oneEncoder.encode(encryptedData);
	    
		return encryptedData;
	}
	
	public String decryptMessage(byte[] encryptedMessage, String keyName) throws Exception {
		PrivateKey privKey = (PrivateKey)readKeyFromFile(keyName, PRIVATE);
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.DECRYPT_MODE, privKey);
		byte[] decryptedData = cipher.doFinal(encryptedMessage);
	    
		return new String(decryptedData,StandardCharsets.UTF_8);
	}
	
	public void saveToFile(String fileName, BigInteger mod, BigInteger exp) throws IOException {
		ObjectOutputStream oout = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(fileName)));
		try {
			oout.writeObject(mod);
			oout.writeObject(exp);
		} catch (Exception e) {
			throw new IOException("Unexpected error", e);
		} finally {
			oout.close();
		}
	}
	
	Key readKeyFromFile(String keyFileName, String type) throws IOException {
		InputStream in = new FileInputStream (PATH_KEYSTORAGE + keyFileName+ type + KEY_EXTENSION);
		ObjectInputStream oin = new ObjectInputStream(new BufferedInputStream(in));
		
		try {
			BigInteger m = (BigInteger) oin.readObject();
			BigInteger e = (BigInteger) oin.readObject();
		    
			if (type.equals("public")) {
				RSAPublicKeySpec keySpec = new RSAPublicKeySpec(m, e);
				KeyFactory fact = KeyFactory.getInstance("RSA");
				PublicKey pubKey = fact.generatePublic(keySpec);
				return pubKey;		    	
			} else {
				RSAPrivateKeySpec keySpec = new RSAPrivateKeySpec(m, e);
				KeyFactory fact = KeyFactory.getInstance("RSA");
				PrivateKey pubKey = fact.generatePrivate(keySpec);
				return pubKey;		    	
			}
		} catch (Exception e) {
			throw new RuntimeException("Spurious serialisation error", e);
		} finally {
			oin.close();
		}
	}
}
