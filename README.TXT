
21. The clock returns a time of 00:00 because of the method that we called. The class ClockDisplay has two different constructors: ClockDisplay() and ClockDisplay(int hour, int minute). Since we constructed an instance of the ClockDisplay with the first constructor, which doesn't specify the time shown on the clock, it's automatically set to 0. (* Constructor for ClockDisplay objects. This constructor, creates a new clock set at 00:00).

23. In order for us to get 01:00 on the ClockDisplay, we need to either call the timeTick method 60 times, which the the amount of times required to change the minutes into 1 hour, or, we could also use the setTime method, which skips the tedious parts and allows us to simply set the time displayed on the clock.

24. 

25. 

26. The second constructor is different from the first one because it allows us to set the time in the 'minute' and 'hour' when creating the object. It does so by setting the value of (hour) & (minute) as the values that we entered with setValue();

27. 

28. 

30. 

31. 

32.

33.

34.

35. 

37.
