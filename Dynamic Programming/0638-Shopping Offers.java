//Solution 1 use recursion and temp to store intermediate state
public class Solution {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
    	return helper(price, special, needs, 0);
    }
    
    private int helper(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int pos) {
    	int local_min = directPurchase(price, needs);
    	for (int i = pos; i < special.size(); i++) {
    		List<Integer> offer = special.get(i);
    		List<Integer> temp = new ArrayList<Integer>();
        	for (int j= 0; j < needs.size(); j++) {
        		if (needs.get(j) < offer.get(j)) { // check if the current offer is valid
        			temp =  null;
        			break;
        		}
        		temp.add(needs.get(j) - offer.get(j));
        	}
        	
    		if (temp != null) { // use the current offer and try next
    			local_min = Math.min(local_min, offer.get(offer.size() - 1) + helper(price, special, temp, i)); 
    		}
    	}

    	return  local_min;
    }
    
    private int directPurchase(List<Integer> price, List<Integer> needs) {
    	int total = 0;
    	for (int i = 0; i < needs.size(); i++) {
    		total += price.get(i) * needs.get(i);
    	}
    	
    	return total;
    }
}