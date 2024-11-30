package week7.testAnswer;

class Secret {
  int level = 1;
}

class Password extends Secret {
  int level = 2;
  
  public static void main(String[] args) {
    int age = Password.level;
    System.out.println(this.level);
  }
}