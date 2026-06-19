class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans[] = new int[n];
        for(int i = 0; i<bookings.length; i++){
            int first = bookings[i][0];
            int last = bookings[i][1];
            int seats = bookings[i][2];
            while(first <= last){
                ans[first-1] += seats;
                first++;
            }
        }
        return ans;
    }
}