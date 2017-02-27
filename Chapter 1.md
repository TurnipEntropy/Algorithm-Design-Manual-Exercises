##Chapter 1
###Finding Counterexamples
1-1. -5 + -1 < min(-5, -1)  
1-2. -1 x 2 < min (-1, 2)  
1-3. a_5_b &nbsp;&nbsp;(numbers are time, _ = 1 distance, \ = 1.414 distance)    
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\1/1    
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;c  
1-4. |---a----------------------------------|   
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;b----------------------------------|  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|---|  
1-5. a) S = {3, 2, 2}, T = 4.  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;First-fit knapsack results in 3 being added despite the fact that if all of the 2's  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;were selected the knapsack would be full.  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;b) S = {3, 2, 2} T = 3.  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Best-fit knapsack puts the 2 in first (smallest to largest), and can't fill the knapsack.  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;c) S = {2, 2, 3} T = 4.  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Largest-to-smallest knapsack puts the 3 in first, can't fill the knapsack.  
1-6. U = {1, 2, 3, 4, 5, 6}&nbsp;&nbsp;S<sub>1</sub>={1, 3, 4, 5}&nbsp;&nbsp;S<sub>2</sub>={2, 3, 4}&nbsp;&nbsp;S<sub>3</sub>={1, 5, 6}  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;If you chose the set that covers the most of U, you'd pick S<sub>1</sub> first, but then you would  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;have to pick both S<sub>2</sub> and S<sub>3</sub> to cover U, resulting in 3 sets to cover U. S<sub>2</sub> and S<sub>3</sub> cover U  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;on their own, however, and are the actual smallest set cover.
