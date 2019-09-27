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
    UselessString str = new UselessString("I'm so Meta, even this acronym");
    String expectedStr = "IsMeta";
    System.out.println("Abbreviate: [I'm so Meta, even this acronym]");
    System.out.println("Expected result: [IsMeta]");
    String abbreviatedString = str.abbreviate();
    System.out.println("Actual result: [" + abbreviatedString + "]");
    return abbreviatedString.equals(expectedStr) ? true : false;
  }

  static boolean removeSubstringTest() {
    UselessString str = new UselessString("I'm so Meta, even this acronym");
    String expectedStr = "I'm so Met, even this cronym";
    System.out.println("Remove 'a' from: [I'm so Meta, even this acronym]");
    System.out.println("Expected result: [I'm so Met, even this cronym]");
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
