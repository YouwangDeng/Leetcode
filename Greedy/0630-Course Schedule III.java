//Solution 1 use one PriorityQueue
public class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a,b)->a[1]-b[1]); //Sort the courses by their deadlines (Greedy! We have to deal with courses with early deadlines first)
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        int time=0;
        for (int[] c:courses) 
        {
            time+=c[0]; // add current course to a priority queue
            pq.add(c[0]);
            if (time>c[1]) time-=pq.poll(); //If time exceeds, drop the previous course which costs the most time. (That must be the best choice!)
        }        
        return pq.size();
    }
}