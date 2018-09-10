//Solution 1 iterator next() and hasNext() solution
public class Vector2D implements Iterator<Integer> {

    Iterator<List<Integer>> input_vec2d = null;
    Iterator<Integer> current = null;
    public Vector2D(List<List<Integer>> vec2d) {
        input_vec2d = vec2d.iterator();
        if(input_vec2d.hasNext()) current = input_vec2d.next().iterator();
    }

    @Override
    public Integer next() {
        return current==null? null:current.next();
    }

    @Override
    public boolean hasNext() {
        if(current==null) return false;
        while(!current.hasNext()) {
            if(!input_vec2d.hasNext()) return false;
            current = input_vec2d.next().iterator();
        }
        return true;
    }
}

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D i = new Vector2D(vec2d);
 * while (i.hasNext()) v[f()] = i.next();
 */