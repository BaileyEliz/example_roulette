# example_roulette
Program to refactor that plays a game of roulette

Cameron Givler
Bailey Wall

##Questions

###1. In what ways is the refactored code simpler?
The code is simpler because we now have eliminated many if statements that switched
between different types of bets.  Instead of if statements, we subclassed `Bet` with
the three different types (plus the ones we added).  We then implemented abstract
methods inside `Bet`, `getPrompt()` and `wonBet()`.  These methods are no longer implemented
in game, and simply have functionality defined in their respective subclass.  We
also broke up `Play()` into multiple helper methods to improve readability.

###2. In what ways is the refactored code more complex?
There are now more classes that you have to look through to figure out the functionality
of each type of bet.

###3. What trade-offs did you make when refactoring your old code?
Our implementation requires instantiating a new class for each `Bet` subclass, even if that
specific instance isn't currently being used.  We had to make this trade-off because we have to
be able to access myDescription from within each class.


###4. Which code do you prefer and why?
I prefer the new code because I think it is easier to read.  It is also more easily
extended.  The only modifications that need to be made to extend the number of
possible bets is to create a new subclass of bet and add it to the array of possible bets.