package no.iskra.ipsum;

final class Ipsum {
  final String str;
  final String[] punctation;

  Ipsum(String str) {
    this.str = str;
    this.punctation = new String[] {".",",","!","?",":",";"};
  }

  public int wordCount() {
    return str.split("\\s").length;
  }

  public double averageWordLength() {
    int totLen = 0;
    for (String word : str.split("\\s")) {
      word = stripPunctation(word);
      totLen += word.length();
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
    return str.toUpperCase();
  }

  String stripPunctation(String s) {
    for (String p : punctation) {
      s.replace(p,"");
    }
    return s;
  }
}
