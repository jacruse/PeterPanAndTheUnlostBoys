# PeterPanAndTheUnlostBoys (Thomas Lin, James Cruse Mulhall, Chris Yu)

##Design

###ArrayPriorityQueue

- Utilizes ArrayList as its underlying structure
- Incorporates generic typing
- add() method uses binary search for faster runtime execution

###Ticket

- Implements Comparable and overwrites compareTo()
- compareTo() returns 1 if this has higher VIP level(lower VIP number), 0 if equal, or 1 if less.
- Allows for user input with Keyboard.java
- Contains a tracker that increases ID number by 1 for every new ticker and refreshes after 10000.

###HelpDesk

- Utilizes a ArrayPriorityQueue of Tickets

###Embellishments

- The usage of Keyboard.java. It allows for the user to input their problem, name, and VIP level as opposed to just creating test cases with different problems, VIP levels, and names.