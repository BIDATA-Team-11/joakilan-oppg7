package no.iskra.strings;

public final class UselessString {
  final String str;

  UselessString(String str) {
    this.str = str;
  }

  public String getString() {
    return str;
  }

  public String abbreviate() {
    String ret = "";
    for (String word : str.split(" ")) {
      ret += String.format("%c", word.charAt(0));
    }
    return ret;
  }

  public String removeSubstring(String ss) {
    return str.replace(ss,"");
  }
}
