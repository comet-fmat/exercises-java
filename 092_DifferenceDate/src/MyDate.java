public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    /*

    92.1: Difference in years, first version
    Add to the class MyDate the method public int differenceInYears(MyDate comparedDate),
    that calculates the difference in years of the object for which the method is called and
    the object given as parameters.
    Note the following
    the first vesion of the method is not very precise, it only calculates the 
    difference of the years and does not take into account the day and month of the dates
    The Method needs to work only in the case where the date given as parameter is before 
    the date for which the method is called
    
    92.2:More accuracy
    Calculation of the previous version was not very exact, 
    e.g. the difference of dates 1.1.2011 and 25.12.2010 was claimed to be one year.
    Modify the method so that it can calculate the difference properly. 
    Only the full years in difference count. 
    So if the difference of two dates would be 1 year and 364 days, 
    only the full years are counted and the result is thus one.

    The method still needs to work only in the case where the date given as parameter 
    is before the date for which the method is called
    
    92.3: And the final version
    Modify the method so that it works no matter which date is later, the one for 
    which the method is called or the parameter.
    
    
    */
    //BEGIN SOLUTION
    public int differenceInYears(MyDate comparedDate){
        int years = 0;
        int buffer, buffer2 = 0;
        
        years = Math.abs(this.year - comparedDate.year);
        
            if(this.month > comparedDate.month && this.day > comparedDate.day){ 
                return years;
            } else {
                if(years>=1){
                    if(this.month == comparedDate.month){
                        if(this.day == comparedDate.day){
                            return Math.abs(this.year - comparedDate.year);
                        } else {
                            if(this.day < comparedDate.day){
                                return years-1;
                            } else {
                                //if(years > 1){
                                    return years;
                                //} else {
                                //    return 0;
                                //}
                                
                            }
    
                        }
             
                    } else {
                        if(this.month > comparedDate.month){
                   
                            if(this.day>comparedDate.day){
                                return years-1;
                            } else {
                                return years-1;
                            }
                        
                        } else {
                            return years-1;
                        }
                    }
                } else {
                    return years;
                }
        }
    }
    //END SOLUTION
}
