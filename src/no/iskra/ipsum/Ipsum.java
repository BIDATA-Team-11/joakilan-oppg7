package no.iskra.ipsum;

final class Ipsum {
  final String str;

  Ipsum(String str) {
    this.str = str;
  }

  public int wordCount() {
    return str.split("\\s").length;
  }

  public double averageWordLength() {
    int totLen = 0;
    for (String word : str.split("\\s")) {
      word = stripPunctation(word);
      totLen += word.length();
      //System.out.print(word);
    }
    return (float)totLen / this.wordCount();
  }

  public double averageWordsPerPeriod() {
    return (float)this.wordCount() / (float)str.split("\\.|,|!").length;
  }

  public String replaceSubstring(String orig, String replace) {
    return str.replace(orig, replace);
  }

  public String getString() {
    return str;
  }

  public String getStringUppercase() {
    //System.out.println(str.toUpperCase());
    return str.toUpperCase();
  }

  static String stripPunctation(String s) {
    s = s.replace(".", "");
    s = s.replace(",", "");
    s = s.replace("!", "");
    s = s.replace("?", "");
    s = s.replace(":", "");
    s = s.replace(";", "");
    return s;
  }
}
