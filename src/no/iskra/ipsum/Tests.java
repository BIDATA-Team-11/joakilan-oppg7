package no.iskra.ipsum;

import no.iskra.ipsum.Ipsum;

class Tests {
  public static void main(String[] args) {
    String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. La oss også legge inn et par komma, og et spørsmålstegn? Ja, det gjør vi! Sånn, nå kan vi teste.";
    Ipsum txt = new Ipsum(str);
    boolean pass = true;

    System.out.println("Text:");
    System.out.println(str);
    System.out.println();

    if (wordCountTest(txt)) {
      System.out.println("Word count test PASSED");
    } else {
      System.out.println("Word count test FAILED");
      pass = false;
    }

    System.out.println();

    if (averageWordLengthTest(txt)) {
      System.out.println("Word length test PASSED");
    } else {
      System.out.println("Word length test FAILED");
      pass = false;
    }

    System.out.println();

    if (averageWordsPerPeriodTest(txt)) {
      System.out.println("Average words per period test PASSED");
    } else {
      System.out.println("Average words per period test FAILED");
      pass = false;
    }

    System.out.println();

    if (replaceSubstringTest(txt)) {
      System.out.println("Replace substring test PASSED");
    } else {
      System.out.println("Replace substring test FAILED");
      pass = false;
    }

    System.out.println();

    if (getStringTest(txt, str)) {
      System.out.println("Get string test PASSED");
    } else {
      System.out.println("Get string test FAILED");
      pass = false;
    }

    System.out.println();

    if (getStringUppercaseTest(txt, str)) {
      System.out.println("Get uppercase test PASSED");
    } else {
      System.out.println("Get uppercase test FAILED");
      pass = false;
    }

    System.out.println();

    System.out.println(pass?"All tests PASSED.":"One or more tests FAILED.");
  }

  static boolean wordCountTest(Ipsum txt) {
    int wc = txt.wordCount();
    System.out.printf("Words: %d%n", wc);
    return wc == 111 ? true : false;
  }

  static boolean averageWordLengthTest(Ipsum txt) {
    double wl = txt.averageWordLength();
    System.out.printf("Average word length: %.2f characters%n", wl);
    return wl > 0 && wl < 10 ? true : false;
  }

  static boolean averageWordsPerPeriodTest(Ipsum txt) {
    double wpp = txt.averageWordsPerPeriod();
    System.out.printf("Average words per period: %.2f words%n", wpp);
    return wpp > 8 && wpp < 9 ? true : false;
  }

  static boolean replaceSubstringTest(Ipsum txt) {
    return txt.replaceSubstring(",", ";").contains(";") ? true : false;
  }

  static boolean getStringTest(Ipsum txt, String orig) {
    return txt.getString().equals(orig) ? true : false;
  }

  static boolean getStringUppercaseTest(Ipsum txt, String orig) {
    return txt.getStringUppercase().equals(orig.toUpperCase()) ? true : false;
  }
}
