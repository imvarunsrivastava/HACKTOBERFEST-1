class Solution {
    public int totalFruit(int[] tree) {
    if(tree==null||tree.length<=2) return tree.length;
     int j=0;
     int max = Integer.MIN_VALUE;   
     int numSelected=0;
     Set<Integer> fruitsSelected = new HashSet<>();
     Integer prevSelectedIndex = null;
     
     while(j<tree.length){       // iterate through the trees
        if(fruitsSelected.size()<2){  // if we have not yet selected two fruits
            prevSelectedIndex = j;   // store the current index in prev 
            fruitsSelected.add(tree[j]); // select the fruit
            j++; // increment index
            numSelected++; // increment the count
        }else if(fruitsSelected.size()>=2){ // if we have already selected more equal to 2 fruits
            if(fruitsSelected.contains(tree[j])){ // if the fruit is the one we have  selected
                j++;  // go to the next tree and increment the count
                numSelected++;
            }else{ // we have a new type of fruit, but we already have two fruits selected
                max = Math.max(max,numSelected); // reset the max
                numSelected =0; // reset the number of selections -we will move the window back and
									        // reselect the fruits
                fruitsSelected.clear(); // unselect all fruit
                j = prevSelectedIndex; // reset the index to prev
            }
        } 
     }
        return Math.max(max,numSelected); // need to do max again as we may never have more than 2 types of fruits
    }
}
