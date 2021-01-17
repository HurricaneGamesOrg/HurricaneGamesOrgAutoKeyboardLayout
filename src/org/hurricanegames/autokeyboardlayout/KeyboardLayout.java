package org.hurricanegames.autokeyboardlayout;

import java.util.HashMap;

public class KeyboardLayout {

	protected final HashMap<Integer, Integer> toEn = new HashMap<>();
	protected final HashMap<Integer, Integer> fromEn = new HashMap<>();

	protected void addMapping(char from, char to) {
		toEn.put(Integer.valueOf(from), Integer.valueOf(to));
		fromEn.put(Integer.valueOf(to), Integer.valueOf(from));
	}

	public boolean isSlash(int codepoint) {
		Integer replacement = toEn.get(codepoint);
		return replacement != null && replacement == '/';
	}

	public String invert(String string) {
		StringBuilder sb = new StringBuilder(string.length());
		string.codePoints().forEach(codepoint -> {
			Integer replacement = toEn.get(codepoint);
			if (replacement == null) {
				replacement = fromEn.get(codepoint);
			}
			sb.append(replacement != null ? Character.toChars(replacement) : Character.toChars(codepoint));
		});
		return sb.toString();
	}

}