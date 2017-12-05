
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        //BEGIN SOLUTION
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        NHLStatistics.searchByPlayer("Sidney Crosby");

        NHLStatistics.teamStatistics("PHI");

        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        //END SOLUTION
        //STUB:
         /* 
        Start by sorting players based on goals, this can be done with command NHLStatistics.sortByGoals()
        After sorting players by goals, print players with command top
        After printing players sorted by goals, sort the players by penalties
        Print players with command top
        After printing players sorted by penalties, search statistics of Sidney Crosby
        Print statistics of team PHI
        After printing statistics of PHI sort players by points
        At the end print statistics of ANA        
        */

    }
}
