
21. The clock returns a time of 00:00 because of the method that we called. The class ClockDisplay has two different constructors: ClockDisplay() and ClockDisplay(int hour, int minute). Since we constructed an instance of the ClockDisplay with the first constructor, which doesn't specify the time shown on the clock, it's automatically set to 0. (* Constructor for ClockDisplay objects. This constructor, creates a new clock set at 00:00).

23. In order for us to get 01:00 on the ClockDisplay, we need to either call the timeTick method 60 times, which the the amount of times required to change the minutes into 1 hour, or, we could also use the setTime method, which skips the tedious parts and allows us to simply set the time displayed on the clock.

24. 

25. 

26. The second constructor creates an instance of ClockDisplay that displays the values of our input as the time. 

27. There isn't a call to updateDisplay in the second constructor because 

28. 

29. The constructor of the Picture class creates the following objects: 2 Squares, 1 Triangle, and 1 Circle. Also, I know this isn't the question, but the objects are not yet drawn because the drawn = false;. After creating the object, you have to call the draw method in order to actually draw on the canvas.

30. 

31. 

32. The result is 2.

33.

34.

35. 

37.
