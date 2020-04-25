/*
 Pokemon Battle Simulation
 Author: Nithursan 
 Teacher: Mr.Ho
 */

import java.util.*;
class Pokemon {
  public static void main(String [] args) {
    // Scanner Class
    Scanner reader = new Scanner(System.in);
    
    // Arrays for Health and User Pokemons
    String[] UserPokemon = {"Pikachu", "Geodude", "Torterra"};
    int[] UserHealth = {100,100,100};
    
    // Arrays for Computer Pokemon and Health
    String[] ComputerPokemon = {"Piplup", "Magikarp", "Mewtwo"};
    int[] ComputerHealth = {100,100,100};
    
    // Introduction Statements
    System.out.println("Welcome to the game of Pokemon!");
    System.out.println("You opponent has sent out: " + ComputerPokemon[0] + "!");
    System.out.println("HP:"+  ComputerHealth[0] + " | " + ComputerPokemon[0]);
    System.out.println("You have sent out: " + UserPokemon[0] + "!");
    System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
    
    //First Pokemon
    String Pokechoice;
    Pokechoice = UserPokemon[0];
    
    // Loop Variables for The selectable Fight or Swap
    boolean FightLoop = true;
    boolean SecondLoop = false;
    
    // Beginning Loop
    while (FightLoop) {
      
    // Option to fight or swap
    System.out.println("What will you do? (Choose a number)");
    System.out.println("1. Fight");
    System.out.println("2. Swap pokemon");
    int choice = reader.nextInt();
    
    // If statement is satisfied SwapLoop starts
    if (choice == 2) {
     FightLoop = false;
    SecondLoop = true;
    }
    
    // If Fight is satisfied
    if (choice == 1) {
      System.out.println("You have chosen to fight!");
    
    // Selected pokemon is Pikachu
    if (Pokechoice == UserPokemon[0]) {
      System.out.println("What will " + Pokechoice + " do? (Choose its appropriate number)");
      if (Pokechoice == UserPokemon[0]) {
      System.out.println("1. Zippy Zap");
      System.out.println("2. Thunder Shock");
      System.out.println("3. Wild Charge");
      System.out.println("4. Pika Papow");
      
       // Attack Choice | Pikachu
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
           //Opponent Turn
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
    }
    
    
  // If Selected pokemon is Geodude
        if (Pokechoice == UserPokemon[1]) {
      System.out.println("What will " + UserPokemon[1] + " do? (Choose its appropriate number)");
      System.out.println("1. Earthquake");
      System.out.println("2. Rock Slide");
      System.out.println("3. Rock Throw");
      System.out.println("4. Take Down");
      
       // Attack Choice | Geodude
      int AttackChoice = reader.nextInt();
        if (AttackChoice == 1) {
        System.out.println("You Have dealt 20 damage with Earthquake!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
       if (AttackChoice == 2) {
        System.out.println("You Have dealt 20 damage with Rock Slide!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
        if (AttackChoice == 3) {
        System.out.println("You Have dealt 20 damage with Rock Throw!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
        if (AttackChoice == 4) {
        System.out.println("You Have dealt 20 damage with Take Down!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
        }
         
        //Opponent Turn
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
        
// If selected pokemon is Torterra        
        if (Pokechoice == UserPokemon[2]) {
      System.out.println("What will " + UserPokemon[2] + " do? (Choose its appropriate number)");
      System.out.println("1. Razor Leaf");
      System.out.println("2. Wood Hammer");
      System.out.println("3. Absorb");
      System.out.println("4. Withdraw");
        
       // Attack Choice | Torterra
        int AttackChoice = reader.nextInt();
        if (AttackChoice == 2) {
        System.out.println("You Have dealt 20 damage with Wood Hammer!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
        if (AttackChoice == 3) {
        System.out.println("You Have dealt 20 damage with Absorb!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
        if (AttackChoice == 4) {
        System.out.println("You Have dealt 20 damage with Withdraw!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
       if (ComputerHealth[0]>0){
    System.out.println("Piplup has decided to use Bubble Beam! | Your Pokemon has lost 20 Damage!");
    UserHealth[2] = UserHealth[0]-10;   
    System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
    System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
    }
    else {
      System.out.println("You defeated Piplup!");
      break;
    }
    }
    }
 
    // Start of the swap loop
        while(SecondLoop) {
      System.out.println("You have chosen to Swap your pokemon!");
      System.out.println("Choose your pokemon (it's number): ");
      System.out.println("1." + UserPokemon[0] + " 2." + UserPokemon[1] + " 3." + UserPokemon[2]);
    
     int SwapChoice = reader.nextInt();
     
     // If Swap is Pikachu
      if (SwapChoice == 1) {
      Pokechoice = UserPokemon[0];
      System.out.println("What will " + UserPokemon[0] + " do? (Choose its appropriate number)");
      System.out.println("1. Zippy Zap");
      System.out.println("2. Thunder Shock");
      System.out.println("3. Wild Charge");
      System.out.println("4. Pika Papow");
      
      // Attack Choice || Pikachu
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
    System.out.println("Piplup has decided to use Bubble Beam! | Your Pokemon has lost 20 Damage!");
    UserHealth[0] = UserHealth[0]-10;   
    System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
    System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
    FightLoop = true;
    SecondLoop = false;
    }
    else {
      System.out.println("You defeated Piplup!");
      break;
    }
      }
        
      // If the swap is GeoDude 
      if (SwapChoice == 2) {
      Pokechoice = UserPokemon[1];
      System.out.println("What will " + UserPokemon[1] + " do? (Choose its appropriate number)");
      System.out.println("1. Earthquake");
      System.out.println("2. Rock Slide");
      System.out.println("3. Rock Throw");
      System.out.println("4. Take Down");
      
       // Attack Choice | Geodude
      int AttackChoice = reader.nextInt();
        if (AttackChoice == 1) {
        System.out.println("You Have dealt 20 damage with Earthquake!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
       if (AttackChoice == 2) {
        System.out.println("You Have dealt 20 damage with Rock Slide!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
        if (AttackChoice == 3) {
        System.out.println("You Have dealt 20 damage with Rock Throw!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
        if (AttackChoice == 4) {
        System.out.println("You Have dealt 20 damage with Take Down!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
       if (ComputerHealth[0]>0){
    System.out.println("Piplup has decided to use Bubble Beam! | Your Pokemon has lost 20 Damage!");
    UserHealth[1] = UserHealth[1]-10;   
    System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
    System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
    FightLoop = true;
    SecondLoop = false;
    }
    else {
      System.out.println("You defeated Piplup!");
      break;
    }
      }
      
      // If the swap is Torterra
      if (SwapChoice == 3) {
      Pokechoice = UserPokemon[2];
      System.out.println("What will " + UserPokemon[2] + " do? (Choose its appropriate number)");
      System.out.println("1. Razor Leaf");
      System.out.println("2. Wood Hammer");
      System.out.println("3. Absorb");
      System.out.println("4. Withdraw");
      
       // Attack Choice | Torterra
      int AttackChoice = reader.nextInt();
        if (AttackChoice == 1) {
        System.out.println("You Have dealt 20 damage with Razor Leaf!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
       if (AttackChoice == 2) {
        System.out.println("You Have dealt 20 damage with Wood Hammer!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
        if (AttackChoice == 3) {
        System.out.println("You Have dealt 20 damage with Absorb!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
        if (AttackChoice == 4) {
        System.out.println("You Have dealt 20 damage with Withdraw!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
      }
      //Opponents Turn 
       if (ComputerHealth[0]>0){
    System.out.println("Piplup has decided to use Bubble Beam! | Your Pokemon has lost 20 Damage!");
    UserHealth[2] = UserHealth[2]-10;   
    System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
    System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
    FightLoop = true;
    SecondLoop = false;
    }
    else {
      System.out.println("You defeated Piplup!");
      break;
    }
        }
    }
}
}


