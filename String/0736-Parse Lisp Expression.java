//Solution 1 use HashMap and indexOf and substring methods
class Solution {
    String nextStr = "";
    public int evaluate(String exp){
        return eval(exp.substring(1, exp.length() - 1), new HashMap<>());
    }
    
    public int eval(String exp, Map<String, Integer> upperMap) {
        int pos = 0;
        int len = exp.length() - 1;
        Map<String, Integer> map = new HashMap<>();
        map.putAll(upperMap);
        
        pos = readNext(exp, pos);
        
        if(nextStr.equals("add")){
            
            pos = readNext(exp, pos);
            // we have to consider if nextStr a number, a variable or a expression
            int left = nextStr.indexOf("(") == -1 ? map.containsKey(nextStr) ? map.get(nextStr) : Integer.parseInt(nextStr) : eval(nextStr.substring(1, nextStr.length() - 1), map);
            
            pos = readNext(exp, pos);
            int right = nextStr.indexOf("(") == -1 ? map.containsKey(nextStr) ? map.get(nextStr) : Integer.parseInt(nextStr) : eval(nextStr.substring(1, nextStr.length() - 1), map);
            
            return left + right;
        }
        
        else if(nextStr.equals("mult")){
            
            pos = readNext(exp, pos);
            int left = nextStr.indexOf("(") == -1 ? map.containsKey(nextStr) ? map.get(nextStr) : Integer.parseInt(nextStr) : eval(nextStr.substring(1, nextStr.length() - 1), map);
            
            pos = readNext(exp, pos);
            int right = nextStr.indexOf("(") == -1 ? map.containsKey(nextStr) ? map.get(nextStr) : Integer.parseInt(nextStr) : eval(nextStr.substring(1, nextStr.length() - 1), map);
            
            return left * right;
        }
        else{
            
            pos = readNext(exp, pos);
            // read the next Str one time, if there pos doesn't reach len, it means we are still in the process of assignment. Since if pos < len, we still have the next str (of nextStr) to match with nextStr
            while(pos < len){
                String var = nextStr;
                
                pos = readNext(exp, pos);
                int val = nextStr.indexOf("(") == -1 ? map.containsKey(nextStr) ? map.get(nextStr) : Integer.parseInt(nextStr) : eval(nextStr.substring(1, nextStr.length() - 1), map);
                
                map.put(var, val);
                pos = readNext(exp, pos);
            }
            
            return nextStr.indexOf("(") == -1 ? map.containsKey(nextStr) ? map.get(nextStr) : Integer.parseInt(nextStr) : eval(nextStr.substring(1, nextStr.length() - 1), map);
        }
    }

    // read the next expression/variable/value
    public int readNext(String exp, int pos){
        int len = exp.length();
        int tmp = pos;
        int cnt = 0;
        // deal with expression
        if(exp.charAt(pos) == '('){
            pos++; cnt++;
            for(; pos < len; pos++){
                char ch = exp.charAt(pos);
                if(cnt == 0){
                    break;
                }
                if(ch == '('){
                    cnt++;
                }
                else if(ch == ')'){
                    cnt--;
                }  
            }
        }
        // deal with variable or value
        else{
            for(; pos < len; pos++){
                char ch = exp.charAt(pos);
                if(ch == ' ' || ch == ')'){
                    break;
                }
            }    
        }
        
        nextStr = exp.substring(tmp, pos);
        return pos + 1;
    }
}