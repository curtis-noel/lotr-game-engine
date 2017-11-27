package lotr.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GAMECHARACTERS")
public class GameCharacter {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "CHARACTERCLASS")
   private String characterClass;
   
   @Column(name = "TITLE")
   private String title;

   @Column(name = "THREAT")
   private int threat;
   
   @Column(name = "SPHERE")
   private String sphere;
   
   @Column(name = "WILLPOWER")
   private int willpower;
   
   @Column(name = "ATTACK")
   private int attack;
   
   @Column(name = "DEFENSE")
   private int defense;
   
   @Column(name = "HITPOINTS")
   private int hitPoints;
   
   public GameCharacter() {}
   
   public GameCharacter(String title, int threat, String sphere, int willpower, int attack, int defense, int hitPoints) {
      this.title = title;
      this.threat=threat;
      this.sphere = sphere;
      this.willpower = willpower;
      this.attack = attack;
      this.defense = defense;
      this.hitPoints = hitPoints;
   }

   public long getId() {
	   return this.id;
   }
   
   public String getCharacterClass() {
	   return this.characterClass;
   }
}