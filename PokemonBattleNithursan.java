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
        
  // Damage Selections for opponent Pokemons
      if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
      }
      
       if (AttackChoice == 2) {
        System.out.println("You Have dealt 20 damage with Thunder Shock!");
       if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
      }
        if (AttackChoice == 3) {
        System.out.println("You Have dealt 20 damage with Wild Charge!");
        if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
    
        else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
      }
        if (AttackChoice == 4) {
        System.out.println("You Have dealt 20 damage with Pika Papow!");
        if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
    
        
        else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
      }
        
        // Cheat Detection
       if (AttackChoice > 4 || AttackChoice <= 0) {
          System.out.println("Invalid Move! Opponent turn!");
        }
      }
           //Opponent Turn
    if (ComputerHealth[0] != 0){
    System.out.println("Piplup has decided to use Bubble Beam! | Your Pokemon has lost 10 Damage!");
    UserHealth[0] = UserHealth[0]-10;   
    System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
    System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
    }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
      System.out.println("Your Opponent has sent out Magikarp!");
      System.out.println("Magikarp has decided to use Flail! | Your Pokemon has lost 10 Damage!");
      UserHealth[0] = UserHealth[0]-10;   
      System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
      System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
    }
    else if (ComputerHealth[0] == 0 && ComputerHealth[1] == 0 && ComputerHealth[2] != 0){
      System.out.println("Your Opponent has sent out Mewtwo!");
       System.out.println("Mewtwo has decided to use Psychic! | Your Pokemon has lost 10 Damage!");
      UserHealth[0] = UserHealth[0]-10;   
      System.out.println("HP:"+  (ComputerHealth[2]) + " | " + ComputerPokemon[2]);
      System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
    }
    else {
      System.out.println("You have defeated both Piplup, Magikarp and Mewtwo!");
      System.out.println("You have won!");
      break;
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
         if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
      }
       if (AttackChoice == 2) {
        System.out.println("You Have dealt 20 damage with Rock Slide!");
        
          if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
      }
        if (AttackChoice == 3) {
        System.out.println("You Have dealt 20 damage with Rock Throw!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
        if (AttackChoice == 4) {
        System.out.println("You Have dealt 20 damage with Take Down!");
         if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
      }
                // Cheat Detection
       if (AttackChoice > 4 || AttackChoice <= 0) {
          System.out.println("Invalid Move! Opponent turn!");
        }
      
         
        //Opponent Turn
     if (ComputerHealth[0] != 0){
    System.out.println("Piplup has decided to use Bubble Beam! | Your Pokemon has lost 10 Damage!");
    UserHealth[1] = UserHealth[1]-10;   
    System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
    System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
    }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
      System.out.println("Your Opponent has sent out Magikarp!");
      System.out.println("Magikarp has decided to use Flail! | Your Pokemon has lost 10 Damage!");
      UserHealth[1] = UserHealth[1]-10;   
      System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
      System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
    }
    else if (ComputerHealth[0] == 0 && ComputerHealth[1] == 0 && ComputerHealth[2] != 0){
      System.out.println("Your Opponent has sent out Mewtwo!");
       System.out.println("Mewtwo has decided to use Psychic! | Your Pokemon has lost 10 Damage!");
      UserHealth[1] = UserHealth[1]-10;   
      System.out.println("HP:"+  (ComputerHealth[2]) + " | " + ComputerPokemon[2]);
      System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
    }
    else {
      System.out.println("You have defeated both Piplup, Magikarp and Mewtwo!");
      System.out.println("You have won!");
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
        
        if (AttackChoice == 1) {
          System.out.println("You have dealt 20 damage with Razor Leaf!");
            if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
      }
          
        if (AttackChoice == 2) {
        System.out.println("You Have dealt 20 damage with Wood Hammer!");
         if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
      }
        if (AttackChoice == 3) {
        System.out.println("You Have dealt 20 damage with Absorb!");
       if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
      }
        if (AttackChoice == 4) {
        System.out.println("You Have dealt 20 damage with Withdraw!");
    if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
      }
                      // Cheat Detection
       if (AttackChoice > 4 || AttackChoice <= 0) {
          System.out.println("Invalid Move! Opponent turn!");
        }
        //Opponent Turn
     if (ComputerHealth[0] != 0){
    System.out.println("Piplup has decided to use Bubble Beam! | Your Pokemon has lost 10 Damage!");
    UserHealth[2] = UserHealth[2]-10;   
    System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
    System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
    }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
      System.out.println("Your Opponent has sent out Magikarp!");
      System.out.println("Magikarp has decided to use Flail! | Your Pokemon has lost 10 Damage!");
      UserHealth[2] = UserHealth[2]-10;   
      System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
      System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
    }
    else if (ComputerHealth[0] == 0 && ComputerHealth[1] == 0 && ComputerHealth[2] != 0){
      System.out.println("Your Opponent has sent out Mewtwo!");
       System.out.println("Mewtwo has decided to use Psychic! | Your Pokemon has lost 10 Damage!");
      UserHealth[2] = UserHealth[2]-10;   
      System.out.println("HP:"+  (ComputerHealth[2]) + " | " + ComputerPokemon[2]);
      System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
    }
    else {
      System.out.println("You have defeated both Piplup, Magikarp and Mewtwo!");
      System.out.println("You have won!");
      break;
    }
      }
    }
     if (choice == 2) {
     FightLoop = false;
    SecondLoop = true;
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
        
             if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
      }
      
       if (AttackChoice == 2) {
        System.out.println("You Have dealt 20 damage with Thunder Shock!");
       if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
      }
        if (AttackChoice == 3) {
        System.out.println("You Have dealt 20 damage with Wild Charge!");
        if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
    
        else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
      }
        if (AttackChoice == 4) {
        System.out.println("You Have dealt 20 damage with Pika Papow!");
        if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
    
        
        else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      }
      }
        
        // Cheat Detection
       if (AttackChoice > 4 || AttackChoice <= 0) {
          System.out.println("Invalid Move! Opponent turn!");
        }
      

            //Opponent Turn
    if (ComputerHealth[0] != 0){
    System.out.println("Piplup has decided to use Bubble Beam! | Your Pokemon has lost 10 Damage!");
    UserHealth[0] = UserHealth[0]-10;   
    System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
    System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
     FightLoop = true;
     SecondLoop = false;
    }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
      System.out.println("Your Opponent has sent out Magikarp!");
      System.out.println("Magikarp has decided to use Flail! | Your Pokemon has lost 10 Damage!");
      UserHealth[0] = UserHealth[0]-10;   
      System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
      System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
      FightLoop = true;
      SecondLoop = false;
    }
    else if (ComputerHealth[0] == 0 && ComputerHealth[1] == 0 && ComputerHealth[2] != 0){
      System.out.println("Your Opponent has sent out Mewtwo!");
       System.out.println("Mewtwo has decided to use Psychic! | Your Pokemon has lost 10 Damage!");
      UserHealth[0] = UserHealth[0]-10;   
      System.out.println("HP:"+  (ComputerHealth[2]) + " | " + ComputerPokemon[2]);
      System.out.println("HP:"+ UserHealth[0] + " | " + UserPokemon[0]);
       FightLoop = true;
      SecondLoop = false;
    }
    else {
      System.out.println("You have defeated both Piplup, Magikarp and Mewtwo!");
      System.out.println("You have won!");
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
        if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
      }
       if (AttackChoice == 2) {
        System.out.println("You Have dealt 20 damage with Rock Slide!");
        
          if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
      }
        if (AttackChoice == 3) {
        System.out.println("You Have dealt 20 damage with Rock Throw!");
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
        if (AttackChoice == 4) {
        System.out.println("You Have dealt 20 damage with Take Down!");
         if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      }
      }
                // Cheat Detection
       if (AttackChoice > 4 || AttackChoice <= 0) {
       System.out.println("Invalid Move! Opponent turn!");
        }
      
         
        //Opponent Turn
     if (ComputerHealth[0] != 0){
    System.out.println("Piplup has decided to use Bubble Beam! | Your Pokemon has lost 10 Damage!");
    UserHealth[1] = UserHealth[1]-10;   
    System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
    System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
    FightLoop = true;
    SecondLoop = false;
    }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
      System.out.println("Your Opponent has sent out Magikarp!");
      System.out.println("Magikarp has decided to use Flail! | Your Pokemon has lost 10 Damage!");
      UserHealth[1] = UserHealth[1]-10;   
      System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
      System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      FightLoop = true;
      SecondLoop = false;
    }
    else if (ComputerHealth[0] == 0 && ComputerHealth[1] == 0 && ComputerHealth[2] != 0){
      System.out.println("Your Opponent has sent out Mewtwo!");
       System.out.println("Mewtwo has decided to use Psychic! | Your Pokemon has lost 10 Damage!");
      UserHealth[1] = UserHealth[1]-10;   
      System.out.println("HP:"+  (ComputerHealth[2]) + " | " + ComputerPokemon[2]);
      System.out.println("HP:"+ UserHealth[1] + " | " + UserPokemon[1]);
      FightLoop = true;
      SecondLoop = false;
    }
    else {
      System.out.println("You have defeated both Piplup, Magikarp and Mewtwo!");
      System.out.println("You have won!");
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
        if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
        System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
        System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
      }
          
        if (AttackChoice == 2) {
        System.out.println("You Have dealt 20 damage with Wood Hammer!");
        if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
        System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
      }
        if (AttackChoice == 3) {
        System.out.println("You Have dealt 20 damage with Absorb!");
        if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
        System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
        System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
        System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
      }
        if (AttackChoice == 4) {
        System.out.println("You Have dealt 20 damage with Withdraw!");
    if (ComputerHealth[0] != 0) {
        ComputerHealth[0] = ComputerHealth[0]-20;
         System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
        ComputerHealth[1] = ComputerHealth[1]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
       
      else {
        ComputerHealth[2] = ComputerHealth[2]-20;
         System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
        System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      }
      }
                      // Cheat Detection
       if (AttackChoice > 4 || AttackChoice <= 0) {
       System.out.println("Invalid Move! Opponent turn!");
        }
       
        //Opponent Turn
     if (ComputerHealth[0] != 0){
    System.out.println("Piplup has decided to use Bubble Beam! | Your Pokemon has lost 10 Damage!");
    UserHealth[2] = UserHealth[2]-10;   
    System.out.println("HP:"+  (ComputerHealth[0]) + " | " + ComputerPokemon[0]);
    System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      FightLoop = true;
      SecondLoop = false;
    }
    
     else if (ComputerHealth[0] == 0 && ComputerHealth[1] != 0) {
      System.out.println("Your Opponent has sent out Magikarp!");
      System.out.println("Magikarp has decided to use Flail! | Your Pokemon has lost 10 Damage!");
      UserHealth[2] = UserHealth[2]-10;   
      System.out.println("HP:"+  (ComputerHealth[1]) + " | " + ComputerPokemon[1]);
      System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
      FightLoop = true;
      SecondLoop = false;
    }
    else if (ComputerHealth[0] == 0 && ComputerHealth[1] == 0 && ComputerHealth[2] != 0){
      System.out.println("Your Opponent has sent out Mewtwo!");
       System.out.println("Mewtwo has decided to use Psychic! | Your Pokemon has lost 10 Damage!");
      UserHealth[2] = UserHealth[2]-10;   
      System.out.println("HP:"+  (ComputerHealth[2]) + " | " + ComputerPokemon[2]);
      System.out.println("HP:"+ UserHealth[2] + " | " + UserPokemon[2]);
       FightLoop = true;
      SecondLoop = false;
    }
    else {
      System.out.println("You have defeated both Piplup, Magikarp and Mewtwo!");
      System.out.println("You have won!");
      break;
    }
      }
}
}
}
}