//Solution 1 use HashSet and DFS solution
class Solution {
    HashSet<Integer> enteredRooms = new HashSet<>();

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        enterRoom(0, rooms);
        return enteredRooms.size() == rooms.size();
    }

    private void enterRoom(int roomId, List<List<Integer>> rooms) {
        enteredRooms.add(roomId);
        List<Integer> keysInRoom = rooms.get(roomId);
        for (int key: keysInRoom)
            if (!enteredRooms.contains(key))
                enterRoom(key, rooms);
    }
}