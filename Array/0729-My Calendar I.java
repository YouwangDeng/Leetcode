//Solution 1 use TreeMap floorKey and ceilingKey
class MyCalendar {

    TreeMap<Integer, Integer> calendar;

    public MyCalendar() {
        calendar = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer floorKey = calendar.floorKey(start);
        if (floorKey != null && calendar.get(floorKey) > start) return false;
        Integer ceilingKey = calendar.ceilingKey(start);
        if (ceilingKey != null && ceilingKey < end) return false;

        calendar.put(start, end);
        return true;
    }
}
//Solution 2 use ArrayList and overlap rule
class MyCalendar {
    private List<int[]> books = new ArrayList<>();
    public boolean book(int start, int end) {
        for (int[] b : books)
            if (Math.max(b[0], start) < Math.min(b[1], end)) return false;
        books.add(new int[]{ start, end });
        return true;
    }
}