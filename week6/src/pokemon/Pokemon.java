package pokemon;

import java.util.Arrays;

public abstract class Pokemon {

  private int number;
  private String name;
  private String[] skills;
  private String pokemonType;

  public Pokemon(int number, String name, String pokemonType) {
    this.name = name;
    this.number = number;
    this.pokemonType = pokemonType;
    this.skills = new String[4];
  }

  public  void learnSkills(String move){
    for (String skill : this.getSkillsSet()) {
      if (move.equals(skill)) {
        System.out.println("Can not learn same skill two times");
      }
      this.skills[3] = move;
    }
  }

  public int getNumber() {
    return this.number;
  }

  public String getName() {
    return this.name;
  }

  public String getPokemonType() {
    return this.pokemonType;
  }

  public String[] getSkillsSet() {
    return this.skills;
  }

  public void skillsSet() {
    System.out.println(Arrays.toString(this.skills));
  }

  @Override
  public String toString() {
    return "[number : " + this.number + //
        ", name : " + this.name + //
        ", type : " + this.pokemonType;
  }
}
