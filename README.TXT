
21. The clock returns a time of 00:00 because of the method that we called. The class ClockDisplay has two different constructors: ClockDisplay() and ClockDisplay(int hour, int minute). Since we constructed an instance of the ClockDisplay with the first constructor, which doesn't specify the time shown on the clock, it's automatically set to 0. (* Constructor for ClockDisplay objects. This constructor, creates a new clock set at 00:00).

23. In order for us to get 01:00 on the ClockDisplay, we need to either call the timeTick method 60 times, which the the amount of times required to change the minutes into 1 hour, or, we could also use the setTime method, which skips the tedious parts and allows us to simply set the time displayed on the clock.

24. NumberDisplay digit = new NumberDisplay(10);

25. Rectangle window = new Rectangle(40, 20); [I think that we have to do what Shapes did, which is the import java.awt.*;]

26. The second constructor creates an instance of ClockDisplay that displays the values of our input as the time. It does so by calling the setTime method, which stored the values in the NumberDisplay objects and then uses another method to call the updateDisplay, which is why we don't see it in this constructor's code.

27. There isn't a call to updateDisplay in the second constructor because 

28. The first way would be like this: 
p1.print("file1", true); -> true because it is double sided
p1.print("file2", false); -> false because it's not

and:

int status1 = p1.getStatus(5); -> 5 seconds delay
int status2 = p1.getStatus(0); -> no delay at all

29. The constructor of the Picture class creates the following objects: 2 Squares, 1 Triangle, and 1 Circle. Also, I know this isn't the question, but the objects are not yet drawn because the drawn = false;. After creating the object, you have to call the draw method in order to actually draw on the canvas.

30. Basically everything that the roof does: changeSize, movrHorizontal, moveVertical, makeVisible. Since they are all methods defined in the Triangle class, they are external methods.

31. I don't think so. All it does it to call methods already defined in other objects (so external methods)

32. The result is 2.

33. If we use the modulo operator with negative numbers, one of two things could happpen: we will get a negative result if the number before the % is negative, or if both sides are negative. If only the number after the % is negative, then the answer will stay positive.

34.

35. 

37. I feel like the second option would be better if what we wanted to make was an actual clock, but since this is just a BlueJ project, version 1 is better because it's way simpler.
