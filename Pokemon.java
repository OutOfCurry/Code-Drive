/*
 Pokemon Battle Simulation
 Author: Nithursan 
 Teacher: Mr.Ho
 */

import java.util.*;
class PokemonAssignment {
  public static void main(String [] args) {
    // Scanner Class
    Scanner reader = new Scanner(System.in);
    
    String[] UserPokemon = {"Pikachu", "Geodude", "Torterra"};
    int[] UserHealth = {100,100,100};
    
    
    String[] ComputerPokemon = {"Piplup", "Magikarp", "Mewtwo"};
    int[] ComputerHealth = {100,100,100};
    
    
    System.out.println("Welcome to the game of Pokemon!");
    System.out.println("You opponent has sent out: " + ComputerPokemon[0] + "!");
    System.out.println("HP:"+  ComputerHealth[0] + " | " + ComputerPokemon[0]);
    System.out.println("You have sent out: " + UserPokemon[0] + "!");
    System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
    
     System.out.println("What will " + UserPokemon[0] + " do? (Choose its appropriate number)");
      System.out.println("1. Zippy Zap");
      System.out.println("2. Thunder Shock");
      System.out.println("3. Wild Charge");
      System.out.println("4. Pika Papow");
      
      
      int AttackChoice = reader.nextInt();
      if (AttackChoice == 1) {
        System.out.println("You Have dealt 20 damage with Zippy Zap!");
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
       if (AttackChoice == 2) {
        System.out.println("You Have dealt 20 damage with Thunder Shock!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
        if (AttackChoice == 3) {
        System.out.println("You Have dealt 20 damage with Wild Charge!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
        if (AttackChoice == 4) {
        System.out.println("You Have dealt 20 damage with Pika Papow!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
        }
        if (ComputerHealth[0]>0){
        System.out.println("Piplup has decided to use Bubble Beam! | Your Pokemon has lost 10 Damage!");
        UserHealth[0] = UserHealth[0]-10;   
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
    }
        
        
        while (true) {
          System.out.println("Choose your pokemon (it's number): ");
          System.out.println("1." + UserPokemon[0] + " 2." + UserPokemon[1] + " 3." + UserPokemon[2]);
          int SwapChoice = reader.nextInt();
     
          if (SwapChoice == 1) {
      System.out.println("What will " + UserPokemon[0] + " do? (Choose its appropriate number)");
      System.out.println("1. Zippy Zap");
      System.out.println("2. Thunder Shock");
      System.out.println("3. Wild Charge");
      System.out.println("4. Pika Papow");
      int LoopAttack = reader.nextInt();
      
        if (LoopAttack == 1) {
        System.out.println("You Have dealt 20 damage with Zippy Zap!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
       if (LoopAttack == 2) {
        System.out.println("You Have dealt 20 damage with Thunder Shock!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
        if (LoopAttack == 3) {
        System.out.println("You Have dealt 20 damage with Wild Charge!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
        if (LoopAttack == 4) {
        System.out.println("You Have dealt 20 damage with Pika Papow!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
        //Opponent Loop
           if (ComputerHealth[0]>0){
    System.out.println("Piplup has decided to use Bubble Beam! | Your Pokemon has lost 20 Damage!");
    UserHealth[0] = UserHealth[0]-10;   
    System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
    System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
    }
    else {
      System.out.println("You defeated Piplup!");
      break;
    }
    }
          
    //Pokemon 2
          if (SwapChoice == 2) {
    System.out.println("What will " + UserPokemon[1] + " do? (Choose its appropriate number)");
      System.out.println("1. Earthquake");
      System.out.println("2. Rock Slide");
      System.out.println("3. Rock Throw");
      System.out.println("4. Take Down");
      
      
      int LoopAttack = reader.nextInt();
        if (LoopAttack == 1) {
        System.out.println("You Have dealt 20 damage with Earthquake!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
       if (LoopAttack == 2) {
        System.out.println("You Have dealt 20 damage with Rock Slide!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
        if (LoopAttack == 3) {
        System.out.println("You Have dealt 20 damage with Rock Throw!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
        if (LoopAttack == 4) {
        System.out.println("You Have dealt 20 damage with Take Down!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
        //Opponent Loop
           if (ComputerHealth[0]>0){
    System.out.println("Piplup has decided to use Bubble Beam! | Your Pokemon has lost 20 Damage!");
    UserHealth[1] = UserHealth[1]-10;   
    System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
    System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
    }
    else {
      System.out.println("You defeated Piplup!");
      break;
    }
        }
          
          if (SwapChoice == 3) {
      System.out.println("What will " + UserPokemon[2] + " do? (Choose its appropriate number)");
      System.out.println("1. Razor Leaf");
      System.out.println("2. Wood Hammer");
      System.out.println("3. Absorb");
      System.out.println("4. Withdraw");
     
        int LoopAttack = reader.nextInt();
        if (LoopAttack == 1) {
        System.out.println("You Have dealt 20 damage with Razor Leaf!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
       if (LoopAttack == 2) {
        System.out.println("You Have dealt 20 damage with Wood Hammer!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
        if (LoopAttack == 3) {
        System.out.println("You Have dealt 20 damage with Absorb!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
        if (LoopAttack == 4) {
        System.out.println("You Have dealt 20 damage with Withdraw!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
        if (ComputerHealth[0]>0){
    System.out.println("Piplup has decided to use Bubble Beam! | Your Pokemon has lost 20 Damage!");
    UserHealth[2] = UserHealth[2]-10;   
    System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
    System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
    }
    else {
      System.out.println("You defeated Piplup!");
      break;
    }
  }
        }
  }
}
