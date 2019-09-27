package no.iskra.strings;

import no.iskra.strings.UselessString;

class Tests {
  public static void main(String[] args) {
    boolean pass = true;

    if (!abbreviateTest()) {
      pass = false;
      System.out.println("Abbreviate string test FAILED.");
    } else {
      System.out.println("Abbreviate string test PASSED.");
    }

    System.out.println();

    if (!removeSubstringTest()) {
      pass = false;
      System.out.println("Remove substring test FAILED.");
    } else {
      System.out.println("Remove substring test PASSED.");
    }

    System.out.println();

    if (!getStringTest()) {
      pass = false;
      System.out.println("Get string test FAILED.");
    } else {
      System.out.println("Get string test PASSED.");
    }

    System.out.println();

    System.out.println(pass?"All tests PASSED.":"One or more tests FAILED.");
  }

  static boolean abbreviateTest() {
    UselessString str = new UselessString("Please abbreviate this text.");
    String expectedStr = "Patt";
    System.out.println("Abbreviate: [Please abbreviate this text.]");
    System.out.println("Expected result: [Patt]");
    String abbreviatedString = str.abbreviate();
    System.out.println("Actual result: [" + abbreviatedString + "]");
    return abbreviatedString.equals(expectedStr) ? true : false;
  }

  static boolean removeSubstringTest() {
    UselessString str = new UselessString("Please remove all a's from this text.");
    String expectedStr = "Plese remove ll 's from this text.";
    System.out.println("Remove 'a' from: [Please remove all a's from this text.]");
    System.out.println("Expected result: [Plese remove ll 's from this text.]");
    String shortenedString = str.removeSubstring("a");
    System.out.println("Actual result: [" + shortenedString + "]");
    return shortenedString.equals(expectedStr) ? true : false;
  }

  static boolean getStringTest() {
    UselessString str = new UselessString("Get this text from UselessString.");
    String expectedStr = "Get this text from UselessString.";
    System.out.println("Create instance, set and get string: [Get this text from UselessString.]");
    System.out.println("Expected result: [Get this text from UselessString.]");
    String gotString = str.getString();
    System.out.println("Actual result: [" + gotString + "]");
    return gotString.equals(gotString) ? true : false;
  }
}
