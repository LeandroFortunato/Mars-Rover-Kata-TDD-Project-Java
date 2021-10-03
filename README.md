# Mars-Rover-Kata

Future Thoughts: 
-----------------


1) Think how easily your program can be extended upon in the future to support a different shaped Plateau.
  
   Answer: The Plateau can assume any future shape, as long as the method "calculateBoundaryAllCoordinates" receives 
characteristics enough of the new shape, so it can calculate and return the coordinates of the perimeter (it has to be modified to do that as well). 

2) How might your Plateau support other vehicles and not just Rovers?

   Answer:  An abstract class named Vehicle was created. Any other vehicle can extend it.



Assumptions for this solution: 
-------------------------------

1) Rovers are taken here as material points, i.e. comparing to the distances involved, their bodies and shape can be neglected.

2) Based on the previous assumption, a coordenate (x,y) on the Plateau is never a material point. In fact, it can cover large distances. 

3) Even though a single coordinate here might cover a large distance, two rovers cannot occupy the same coordinate (x,y) at the same time. In that way we can avoid any possibile collision.
4) In case a trajetory received for a rover crosses a coordinate where another is still, i.e. (Xm,Ym) = (Xs,Ys), the one that is moving will have to turn around just enough along the coordinate of the one that is still, returning to the same direction right after that, so the target provided can still be reached.
