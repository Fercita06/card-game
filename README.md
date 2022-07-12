
Card Game

Our task was to model a card game using the Java language. I’ve broken my code down 
into small parts.

Stage 1 
Using classes, ArrayLists and methods, we had to create a deck of Cards, using the following 
classes:  

CardGame  
•  - Contains an ArrayList<Card> for the deckOfCards that contains all 52 cards. This is 
created and populated when the game is constructed.  
•  - Has a name which is also defined in the constructor.  
•  - Has a getDeck method that lists out the cards in the deck.  
 
Card  
•  - My card class
 •  - Has a String symbol (2,3,4,5,6,7,8,9,10,J,Q,K,A)  
 •  - Has an int value (2,3,4,5,6,7,8,9,10,11,12,13,14)  
 •  - Has a toString method that describes the class 


Stage 2 

I created a CardGame Class where I had implemented all the methods I used to achieved the followint:
Add methods for the CardGame class that allow for the following: 

•  Card dealCard() - takes the card from the top of the deck and returns it  
•  ArrayList<Card> sortDeckInNumberOrder() - sorts the deck in number order (e.g. 
2222333344445555 etc) and stores the new shuffled deck back into the deckOfCards 
attribute  
•  ArrayList<Card> sortDeckIntoSuits() - sorts the deck into suits (2,3,4,5,6,7,8,9,10,J,Q,K,A 
of hearts, then 2,3,4,5,6,7,8,9,10,J,Q,K,A of clubs etc.) and stores the new shuffled deck 
back into the deckOfCards attribute  
•  ArrayList<Card> shuffleDeck() - shuffles the deck into a random order and stores the 
new shuffled deck back into the deckOfCards attribute 
