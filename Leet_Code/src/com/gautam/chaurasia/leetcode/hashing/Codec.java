package com.gautam.chaurasia.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class Codec {

	private Map<String, String> urlMap = new HashMap<>();
	private static final String BASE_URL = "http://tinyurl.com/";
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static final int CODE_LENGTH = 6;

	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		String code;
		do {
			code = generateCode();
		} while (urlMap.containsKey(code)); // Ensure code is unique

		urlMap.put(code, longUrl);
		return BASE_URL + code;
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		String code = shortUrl.replace(BASE_URL, "");
		return urlMap.get(code);
	}

	// Helper method to generate a random code of length CODE_LENGTH
	private String generateCode() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < CODE_LENGTH; i++) {
			int index = (int) (Math.random() * ALPHABET.length());
			sb.append(ALPHABET.charAt(index));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Codec codec = new Codec();
		String longUrl = "https://leetcode.com/problems/design-tinyurl";
		String shortUrl = codec.encode(longUrl);
		System.out.println("Encoded URL: " + shortUrl);
		String decodedUrl = codec.decode(shortUrl);
		System.out.println("Decoded URL: " + decodedUrl);
	}
}
