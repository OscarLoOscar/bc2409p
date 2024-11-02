import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CheckAns_BC2409p {
  public static TreeMap<String, List<String>> ans = new TreeMap<>();
  public static String topic = "quiz 3 " + LocalDate.now() + ": ";

  public static void main(String[] args) {

    ans.put("Mephy     ", List.of("BADAADDEBA", "", "", "", ""));
    ans.put("Frankie   ", List.of("AACBAEBDCA", "", "", "", ""));
    ans.put("Peter     ", List.of("AADAADAAAA", "", "", "", ""));
    ans.put("Xavier    ", List.of("DACABDABBA", "", "", "", ""));
    ans.put("Ivy       ", List.of("CDCBBACECA", "", "", "", ""));
    ans.put("Nick      ", List.of("BADEEECACA", "", "", "", ""));
    ans.put("Kevin Chan", List.of("ACDBADECBA", "", "", "", ""));
    ans.put("Hong      ", List.of("BDDAAEBBCA", "", "", "", ""));
    ans.put("Utah      ", List.of("AADADAAAAB", "", "", "", ""));
    ans.put("Joe      ", List.of("CD⁠DE⁠CCDBAB", "", "", "", ""));
    ans.put("Kevin Yu  ", List.of("", "", "", "", ""));
    ans.put("Christy   ", List.of("", "", "", "", ""));
    countAns(ans);
  }

  public static void countAns(Map<String, List<String>> ans) {
    List<String> modelAns = List.of("BADABDDCBA", "CDDAACABB", "CDDAACAAC",
        "EECECABEDC", "ABABADECDAA");
    int[][] questionMatches = new int[5][];
    for (int i = 0; i < 5; i++) {
      questionMatches[i] = new int[modelAns.get(i).length()];
    }

    for (Map.Entry<String, List<String>> entry : ans.entrySet()) {
      List<String> strList = entry.getValue();
      StringBuilder output = new StringBuilder(entry.getKey() + ": ");

      for (int partIndex = 0; partIndex < strList.size(); partIndex++) {
        if (strList.get(partIndex).isEmpty())
          output.append(" , absent");
        String answer = strList.get(partIndex).toUpperCase();
        if (!answer.isEmpty()) {
          int matchCount = 0;
          for (int i = 0; i < answer.length()
              && i < modelAns.get(partIndex).length(); i++) {
            if (answer.charAt(i) == modelAns.get(partIndex).charAt(i)) {
              matchCount++;
              questionMatches[partIndex][i]++;
            }
          }
          output.append(matchCount).append("/")
              .append(modelAns.get(partIndex).length());
          if (partIndex < strList.size() - 1
              && !strList.get(partIndex + 1).isEmpty()) {
            output.append(" ,");
          }
        } else {
          break; // Stop processing when we encounter an empty answer
        }
      }

      System.out.println(output);
    }

    int lastNonEmptyIndex = 0;
    for (int i = 4; i >= 0; i--) {
      if (!ans.values().iterator().next().get(i).isEmpty()) {
        lastNonEmptyIndex = i;
        break;
      }
    }

    int quizNumber = lastNonEmptyIndex + 1;
    System.out.println("Passing rate for each question of quiz " + quizNumber
        + " " + LocalDate.now() + ":  : ");

    for (int i = 0; i < questionMatches[lastNonEmptyIndex].length; i++) {
      double questionRate =
          (double) questionMatches[lastNonEmptyIndex][i] / ans.size() * 100;
      System.out.println(
          "Question " + (i + 1) + ": " + Math.round(questionRate) + "%");
    }
  }
}
