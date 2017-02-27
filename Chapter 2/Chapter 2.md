##Chapter 2
####Program Analysis
2-1. &nbsp;r = n * (n - 1) + (n - 1) * (n - 2)... + (n - (n - 1)) * (n - n); &nbsp;&nbsp;O(n<sup>3</sup>)  
2-2. &nbsp;r = ((n<sup>2</sup> + n) / 2)(2 + (n - 1) * 2/3); &nbsp;&nbsp;O(n<sup>3</sup>)  
2-3. &nbsp;r = ((n<sup>2</sup> + n) / 2)(2 + (n - 1) * 2/3)(0.5 + (n - 1) * 0.375); &nbsp;&nbsp;O(n<sup>4</sup>)  
2-4.&nbsp;a)&nbsp; multiplications: 2n;&nbsp;&nbsp;additions: n  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;b)&nbsp;The worst-case scenario is the same as the average is the same as the best in this case, so same as above  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;c)&nbsp;Yes, it can be improved. It can be reduced to n multiplications. See TwoFourImprovement.java.
