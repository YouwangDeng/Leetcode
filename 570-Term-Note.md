# 570 Term 1
* master method use the equal bound sign
* pseudocode in DP 
* each subproblem requires finding an index f(k) which can be done in time O(log n) by binary search.

## 570 Term 2
* DP problem
    * you must open at least one charging station along the whole highway.
    * Base cases: OPT(0) = 0, OPT(1) = p1
    * Algorithm solves n subproblems; each subproblem requires finding an index f(k) which can be done in time O(log n) by binary search. Hence, the running time i
* Max Flow
    * max flow problem also need proof
    
    ![Screen Shot 2018-11-24 at 15.44.24](https://lh3.googleusercontent.com/-a6bYgBELUXE/W_niZGm9L8I/AAAAAAAAASk/DZ52TinjU5EOmOy7LHVtfc2sI_PonGeAACHMYCw/I/Screen%2BShot%2B2018-11-24%2Bat%2B15.44.24.png)

    ![Screen Shot 2018-11-24 at 16.43.04](https://lh3.googleusercontent.com/-iQafykY6Qow/W_nwI0dL2NI/AAAAAAAAAS8/t5g_K5ONpG0QXYZ4_toNQand6DVeN-bLACHMYCw/I/Screen%2BShot%2B2018-11-24%2Bat%2B16.43.04.png)
    
*  Randomize 
  
    ![Screen Shot 2018-11-24 at 23.51.56](https://lh3.googleusercontent.com/-UmF3aIvbb4s/W_pUvPi87dI/AAAAAAAAATY/Yc0oeTmg5jULAISKhVTme54Ay5IuQJ1VwCHMYCw/I/Screen%2BShot%2B2018-11-24%2Bat%2B23.51.56.png)

* Notes about answering problems
    * DP 
        * OPT defination
        * formula and base case
        * pseudo code
        * time complexity analyze
    * Max Flow
        * Ford-Fulkerson algorithm
            * f(E + V)
            * find a path DFS
            * augment through the path
            * repeat until no path found
        * find the min-cut(could be multiple)
        * construct flow network
            * vertex
            * edge
            * source vertex s
            * sink vertex t
            * capacity
            * if and only if 
            * max flow value
            * proof --> <--
        * 