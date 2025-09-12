
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    // simulates the actual display
    private NumberDisplay digit;
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        long millis = System.currentTimeMillis();
        long seconds = millis / 1000;
        int currentMinutes = (int) (seconds / 60 % 60);
        int currentHours = (int) (seconds / (60 * 60) % 24);
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        hours.setValue(currentHours);
        minutes.setValue(currentMinutes);
        digit = new NumberDisplay(10);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute)
    {
        //hours = new NumberDisplay(24);
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {
            // It just rolled over!
            hours.increment();
        }
        if(hours.getValue() == 0) {
            hours.setValue(1);
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and minute.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        int internalHour = hours.getValue();
        String suffix = (internalHour < 12) ? "am" : "pm";
        int displayHour = internalHour % 12;
        if(displayHour == 0) {
            displayHour = 12;
        }
        displayString = hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue() + suffix;
    }
}
