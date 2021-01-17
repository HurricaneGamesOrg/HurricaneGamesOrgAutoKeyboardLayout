package org.hurricanegames.autokeyboardlayout;

public class RuQWERTYKeyboardLayout extends KeyboardLayout {

	public static final RuQWERTYKeyboardLayout INSTANCE = new RuQWERTYKeyboardLayout();

	public RuQWERTYKeyboardLayout() {
		addMapping('й', 'q'); addMapping('Й', 'Q');
		addMapping('ц', 'w'); addMapping('Ц', 'W');
		addMapping('у', 'e'); addMapping('У', 'E');
		addMapping('к', 'r'); addMapping('К', 'R');
		addMapping('е', 't'); addMapping('Е', 'T');
		addMapping('н', 'y'); addMapping('Н', 'Y');
		addMapping('г', 'u'); addMapping('Г', 'U');
		addMapping('ш', 'i'); addMapping('Ш', 'I');
		addMapping('щ', 'o'); addMapping('Щ', 'O');
		addMapping('з', 'p'); addMapping('З', 'P');
		addMapping('х', '['); addMapping('Х', '{');
		addMapping('ъ', ']'); addMapping('Ъ', '}');
		addMapping('ф', 'a'); addMapping('Ф', 'A');
		addMapping('ы', 's'); addMapping('Ы', 'S');
		addMapping('в', 'd'); addMapping('В', 'D');
		addMapping('а', 'f'); addMapping('А', 'F');
		addMapping('п', 'g'); addMapping('П', 'G');
		addMapping('р', 'h'); addMapping('Р', 'H');
		addMapping('о', 'j'); addMapping('О', 'J');
		addMapping('л', 'k'); addMapping('Л', 'K');
		addMapping('д', 'l'); addMapping('Д', 'L');
		addMapping('ж', ';'); addMapping('Ж', ':');
		addMapping('э', '\''); addMapping('Э', '"');
		addMapping('я', 'z'); addMapping('Я', 'Z');
		addMapping('ч', 'x'); addMapping('Ч', 'X');
		addMapping('с', 'c'); addMapping('С', 'C');
		addMapping('м', 'v'); addMapping('М', 'V');
		addMapping('и', 'b'); addMapping('И', 'B');
		addMapping('т', 'n'); addMapping('Т', 'N');
		addMapping('ь', 'm'); addMapping('Ь', 'M');
		addMapping('б', ','); addMapping('Б', '<');
		addMapping('ю', '.'); addMapping('Ю', '>');
		addMapping('.', '/'); addMapping(',', '?');
	}

}
