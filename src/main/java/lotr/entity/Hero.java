package lotr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "HEROES")
public class Hero {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

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
   
   @Column(name = "HIT_POINTS")
   private int hitPoints;
   
   @Transient
   private int wounds;
   
   @Transient
   private int resources;
   
   public Hero() {}
   
   public Hero(String title, int threat, String sphere, int willpower, int attack, int defense, int hitPoints) {
      this.title = title;
      this.threat=threat;
      this.sphere = sphere;
      this.willpower = willpower;
      this.attack=attack;
      this.defense=defense;
      this.hitPoints=hitPoints;
   }

   // Getter and Setter methods
}