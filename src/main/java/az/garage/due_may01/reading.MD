- <h3> What is Git Bisect ?</h3>
<p>
It accurately finds the exact commit that introduced an error
<br>
1) git bisect start (tells to Git to prepare the bisect wizard)
<br>
2) git bisect bad (current commit)
<br>
3) git bisect good abc1234
<br>
4) in the end: git bisect reset (go to the original HEAD)
</p>

- <h3>What are Reference Types ?</h3>
<p>
1) Strong type: The default type of reference, 
Any object that has a strong reference pointing to it will not be eligible for garbage collection.
<br>
1) Soft type: If Garbage Collector really needs memory, it can be garbage-collected. 
<br>
1) Weak type: Weaker form of references, it will be collected on the next garbage collection cycle.
<br>
1) Phantom type: The weakest form of references, for instance you can write a custom memory manager.
</p>