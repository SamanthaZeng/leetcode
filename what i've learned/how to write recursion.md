recursive function needs to have two parts:
1. A base case, in which the function can return the result immediately
2. A recursive case, in which the function must call itself to break the current problem down to a simpler level

        function factorial(n){
            // base case
            if(n == 0 || n == 1)
                return 1;
            return n * factorial (n - 1);
        }

go through 3 steps to decide how the recursive call should be structured
1. break the problem - I am trying to solve down into a problem that is one step simpler
2. Assume that my function will work to solve the simpler problem
3. Ask myself: Since I know I can solve the simpler problem, how would I solve the more complext problem

for example, we want to  write a recursive function that will return a reversed copy of the string.
the base case if when the length of the string less than 2, there is no need to reverse the string.

    function reverse(string){
        if(string.length() < 2)
            return string;
    }

then think about the recursive part
1. I am trying to reverse a string, a problem one step simpler would be to reverse a string that is one letter shorter.
2. I will assume that my function can correctly reverse a string that is one letter shorter than the one I am currently trying to reverse.
3. Ask myself: Since I know my function can correctly reverse a string that is one letter shorter than the one I am currently trying to reverse, how can I reverse the whole string? I can take all of the characters except the first one, reverse those, and add the first one at the end of the string.

        function reverse(string){
            if(string.length() < 2)
                return string;
            return reverse(string.slice(1, string.length()) + string[0]);
        }

remember: **do not try to break the problem down all the way to the base case**. You just need to break down one step simpler.

