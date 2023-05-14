package coordinate.share;

public class RepairString {

  private RepairString() {
  }

  public static String[] removeComma(String str) {
    return str.split(",");
  }

  public static String[] removeBracketAndHyphen(String str) {
    str = removeBracket(str);
    return removeHyphen(str);
  }

  private static String removeBracket(String str) {
    str = str.replace("(", "");
    str = str.replace(")", "");
    return str;
  }

  private static String[] removeHyphen(String str) {
    return str.split("-");
  }

}
