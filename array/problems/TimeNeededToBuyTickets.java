package array.problems;
//https://leetcode.com/problems/time-needed-to-buy-tickets/
public class TimeNeededToBuyTickets {

    int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;

        while (tickets[k] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[k] == 0) return count;
                // if current element is not zero then reduce it by one in every iteration
                if (tickets[i] != 0) {
                    tickets[i] = tickets[i] - 1;
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        TimeNeededToBuyTickets req = new TimeNeededToBuyTickets();
        int[] tickets = {2,3,2};
        int k = 2;
        System.out.println("Time required: "+req.timeRequiredToBuy(tickets,k));
    }
}
